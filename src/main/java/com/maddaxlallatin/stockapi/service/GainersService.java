package com.maddaxlallatin.stockapi.service;

import com.maddaxlallatin.stockapi.model.Gainers.SingleGainer;
import com.maddaxlallatin.stockapi.model.Gainers.TopGainers;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class GainersService {
    public TopGainers getGainers(){
        try {
            String url = "https://finance.yahoo.com/markets/stocks/gainers/";
            Document doc = Jsoup.connect(url).get();
            Element trendingTable = doc.selectFirst(".tableContainer.yf-9j21mz");
            Element tableBody = trendingTable.selectFirst("tbody");
            Elements tableRows = tableBody.getElementsByTag("tr");
            ArrayList<SingleGainer> gainerArrayList = new ArrayList<>();
            for(Element row : tableRows){
                Elements tableCells = row.getElementsByTag("td");
                ArrayList<String> singleGainerList = new ArrayList<>();
                int count = 0;
                for(Element cell : tableCells){
                    if(count == 0){
                        String stockTicker = cell.selectFirst(".symbol.yf-138ga19").text();
                        singleGainerList.add(stockTicker);
                    }
                    if(count == 10){
                        singleGainerList.add(cell.selectFirst("a").attr("abs:href"));
                    } else {
                        singleGainerList.add(cell.text());
                    }
                    count++;
                }
                SingleGainer singleGainer = new SingleGainer(singleGainerList.get(0), singleGainerList.get(1),singleGainerList.get(2).split(" ")[0], singleGainerList.get(3), singleGainerList.get(4), singleGainerList.get(5), singleGainerList.get(6), singleGainerList.get(7), singleGainerList.get(8), singleGainerList.get(9), singleGainerList.get(11));

                gainerArrayList.add(singleGainer);

            }
            return new TopGainers(gainerArrayList);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
