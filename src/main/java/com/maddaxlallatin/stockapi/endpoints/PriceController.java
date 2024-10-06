package com.maddaxlallatin.stockapi.endpoints;

import com.maddaxlallatin.stockapi.returns.StockPrice;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {
    @GetMapping("/stock/v1/{ticker}/price")
    public StockPrice getStockData(@PathVariable String ticker){
        try {
            String url = "https://finance.yahoo.com/quote/" + ticker;
            Document htmlDoc = Jsoup.connect(url).get();
            Elements priceElememt = htmlDoc.select(".livePrice.yf-1tejb6");
            String price = priceElememt.text();
            return new StockPrice(ticker, price);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }
}
