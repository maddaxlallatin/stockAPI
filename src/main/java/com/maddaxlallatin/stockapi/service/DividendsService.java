package com.maddaxlallatin.stockapi.service;

import com.maddaxlallatin.stockapi.model.SingleStockDividends;
import com.maddaxlallatin.stockapi.model.StockDividends;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;

@Service
public class DividendsService {

    public StockDividends getStockDividends(String ticker, Integer numDividends){
        try{
            Calendar calendar = Calendar.getInstance();
            long unixEndTime = calendar.getTimeInMillis() / 1000L;

            String url = "https://finance.yahoo.com/quote/%s/history/?filter=div&period1=917015400&period2=%d".formatted(ticker, unixEndTime);
            Document doc = Jsoup.connect(url).get();
            Element table = doc.selectFirst(".table.yf-ewueuo");
            Element tableBody = table.selectFirst("tbody");
            Elements tableRows = tableBody.getElementsByTag("tr");
            ArrayList<SingleStockDividends> dividendsList = new ArrayList<>();
            for(int i = 0; i < numDividends; i++){
                Element thisRow = tableRows.get(i);
                String date = thisRow.getElementsByTag("td").first().text();
                String dividends = thisRow.getElementsByTag("td").last().text();

                SingleStockDividends singleStockDividends = new SingleStockDividends(date, dividends);
                dividendsList.add(singleStockDividends);
            }

            return new StockDividends(ticker, dividendsList);

        } catch(IOException e){
            throw new RuntimeException(e);
        }

    }
}
