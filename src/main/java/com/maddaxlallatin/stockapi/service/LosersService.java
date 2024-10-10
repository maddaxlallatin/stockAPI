package com.maddaxlallatin.stockapi.service;

import com.maddaxlallatin.stockapi.model.Gainers.SingleGainer;
import com.maddaxlallatin.stockapi.model.Losers.SingleLoser;
import com.maddaxlallatin.stockapi.model.Losers.TopLosers;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class LosersService {
    public TopLosers getLosers(){
        try {
            String url = "https://finance.yahoo.com/markets/stocks/losers/";
            Document doc = Jsoup.connect(url).get();
            Element trendingTable = doc.selectFirst(".tableContainer.yf-9j21mz");
            Element tableBody = trendingTable.selectFirst("tbody");
            Elements tableRows = tableBody.getElementsByTag("tr");
            ArrayList<SingleLoser> loserArrayList = new ArrayList<>();
            for(Element row : tableRows){
                Elements tableCells = row.getElementsByTag("td");
                ArrayList<String> singleLoserList = new ArrayList<>();
                int count = 0;
                for(Element cell : tableCells){
                    if(count == 0){
                        String stockTicker = cell.selectFirst(".symbol.yf-138ga19").text();
                        singleLoserList.add(stockTicker);
                    }
                    if(count == 10){
                        singleLoserList.add(cell.selectFirst("a").attr("abs:href"));
                    } else {
                        singleLoserList.add(cell.text());
                    }
                    count++;
                }
                SingleLoser singleLoser = new SingleLoser(singleLoserList.get(0), singleLoserList.get(1),singleLoserList.get(2).split(" ")[0], singleLoserList.get(3), singleLoserList.get(4), singleLoserList.get(5), singleLoserList.get(6), singleLoserList.get(7), singleLoserList.get(8), singleLoserList.get(9), singleLoserList.get(11));

                loserArrayList.add(singleLoser);

            }
            return new TopLosers(loserArrayList);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
