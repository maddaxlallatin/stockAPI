package com.maddaxlallatin.stockapi.service;

import com.maddaxlallatin.stockapi.model.StockPrice;
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
            return new StockPrice(ticker, price);

        } catch (Exception e) {
            return null;
        }

    }
}
