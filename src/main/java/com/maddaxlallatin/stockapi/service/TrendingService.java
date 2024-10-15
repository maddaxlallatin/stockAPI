package com.maddaxlallatin.stockapi.service;

import com.maddaxlallatin.stockapi.model.Trends.SingleTrendingStock;
import com.maddaxlallatin.stockapi.model.Trends.TrendingStocks;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class TrendingService {
    public TrendingStocks getTrendingStocks() {
        try {
            String url = "https://finance.yahoo.com/markets/stocks/trending/";
            Document doc = Jsoup.connect(url).get();
            Element trendingTable = doc.selectFirst(".tableContainer.yf-9j21mz");
            Element tableBody = trendingTable.selectFirst("tbody");
            Elements tableRows = tableBody.getElementsByTag("tr");
            ArrayList<SingleTrendingStock> trendingStocksArrayList = new ArrayList<>();
            for(Element row : tableRows){
                Elements tableCells = row.getElementsByTag("td");
                ArrayList<String> singleStockArrayList = new ArrayList<>();
                int count = 0;
                for(Element cell : tableCells){
                    if(count == 0){
                       String stockTicker = cell.selectFirst(".symbol.yf-138ga19").text();
                        singleStockArrayList.add(stockTicker);
                    }
                    if(count == 10){
                        singleStockArrayList.add(cell.selectFirst("a").attr("abs:href"));
                    } else {
                        singleStockArrayList.add(cell.text());
                    }
                    count++;
                }
                SingleTrendingStock singleTrendingStock = new SingleTrendingStock(singleStockArrayList.get(0), singleStockArrayList.get(1).substring(singleStockArrayList.get(1).indexOf(' ')+1),singleStockArrayList.get(2).split(" ")[0], singleStockArrayList.get(3), singleStockArrayList.get(4), singleStockArrayList.get(5), singleStockArrayList.get(6), singleStockArrayList.get(7), singleStockArrayList.get(8), singleStockArrayList.get(9), singleStockArrayList.get(11));

                trendingStocksArrayList.add(singleTrendingStock);

            }
            return new TrendingStocks(trendingStocksArrayList);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
