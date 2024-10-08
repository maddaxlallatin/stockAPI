package com.maddaxlallatin.stockapi.service;

import com.maddaxlallatin.stockapi.exceptions.InvalidDateException;
import com.maddaxlallatin.stockapi.model.History.SingleStockHistory;
import com.maddaxlallatin.stockapi.model.History.StockHistory;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Calendar;

@Service
public class HistoryService {

    public StockHistory getStockHistory(String ticker, String startDate, String endDate){
        try {
            Calendar calendar = Calendar.getInstance();
            long unixEndTime = calendar.getTimeInMillis() / 1000L;
            calendar.add(Calendar.MONTH, -1);
            long unixStartTime = calendar.getTimeInMillis() / 1000L;
            if (startDate != null) {
                unixStartTime = Instant.parse(startDate + "T00:00:00.00Z").getEpochSecond();
            }
            if (endDate != null) {
                unixEndTime = Instant.parse(endDate + "T00:00:00.00Z").getEpochSecond();
            }
            if (Long.parseLong(String.valueOf(unixEndTime)) < Long.parseLong(String.valueOf(unixStartTime))) {
                throw new InvalidDateException("Invalid Date Range: End date is before start date.");
            }


            String url = "https://finance.yahoo.com/quote/%s/history/?period1=%s&period2=%s".formatted(ticker, unixStartTime, unixEndTime);
            Document doc = Jsoup.connect(url).get();
            Elements tableBody = doc.getElementsByTag("tbody");
            Elements tableRows = tableBody.first().getElementsByTag("tr");

            ArrayList<SingleStockHistory> table = new ArrayList<>();
            for (Element row : tableRows) {
                Elements values = row.getElementsByTag("td");
                ArrayList<String> tableRow = new ArrayList<>();

                for (Element value : values) {
                    tableRow.add(value.text());
                }

                SingleStockHistory singleStockHistory = new SingleStockHistory(tableRow.get(0), tableRow.get(1), tableRow.get(2), tableRow.get(3), tableRow.get(4), tableRow.get(5), tableRow.get(6));
                table.add(singleStockHistory);
            }

            return new StockHistory(ticker, table);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
