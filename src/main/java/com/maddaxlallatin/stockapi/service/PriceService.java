package com.maddaxlallatin.stockapi.service;

import com.maddaxlallatin.stockapi.model.Price.StockPrice;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

@Service
public  class PriceService {
    public StockPrice getStockPrice(String ticker){
        try {
            String url = "https://finance.yahoo.com/quote/" + ticker;
            Document htmlDoc = Jsoup.connect(url).get();
            Elements priceElement = htmlDoc.select(".livePrice.yf-1tejb6");
            String price = priceElement.text();
            String[] yearRange = htmlDoc.selectFirst(".last-md.yf-mrt107").selectFirst(".value.yf-mrt107").text().split("-");
            String yearLow = yearRange[0].strip();
            String yearHigh = yearRange[1].strip();

            String[] dayRange = htmlDoc.select("li.yf-mrt107").get(4).selectFirst(".value.yf-mrt107").text().split("-");
            String dayLow = dayRange[0].strip();
            String dayHigh = dayRange[1].strip();

            String volume = htmlDoc.select("li.yf-mrt107").get(6).selectFirst(".value.yf-mrt107").text();

            return new StockPrice(ticker, price, dayHigh, dayLow, yearHigh, yearLow, volume);

        } catch (Exception e) {
            return null;
        }

    }
}
