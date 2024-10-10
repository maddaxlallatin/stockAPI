package com.maddaxlallatin.stockapi.service;

import com.maddaxlallatin.stockapi.model.Earnings.SingleStockEarnings;
import com.maddaxlallatin.stockapi.model.Earnings.StockEarnings;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;


@Service
public class EarningsService {

    public StockEarnings getStockEarnings(String ticker){
        try{
            String url = "https://finance.yahoo.com/calendar/earnings?symbol=%s".formatted(ticker);
            Document doc = Jsoup.connect(url).get();
            Element tableBody = doc.selectFirst("tbody");
            Elements tableRows = tableBody.select("tr");

            ArrayList<SingleStockEarnings> stockEarnings = new ArrayList<>();

            for(Element row : tableRows){
                Elements tableData = row.select("td");
                ArrayList<String> thisRow = new ArrayList<>();

                for(Element data : tableData){
                   thisRow.add(data.text());
                }

                if(!thisRow.get(3).equals("-")){
                    String date = thisRow.get(2).substring(0, 18) + " " + thisRow.get(2).substring(18); //fix not being a space between AM/PM and EDT/EST
                    stockEarnings.add(new SingleStockEarnings(date, thisRow.get(3), thisRow.get(4), thisRow.get(5)));
                }

            }
            return new StockEarnings(ticker, stockEarnings);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
