package com.maddaxlallatin.stockapi.endpoints;

import com.maddaxlallatin.stockapi.model.StockPrice;
import com.maddaxlallatin.stockapi.service.PriceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PriceController {

    private final PriceService priceService;

    @Autowired
    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping("/stock/v1/{ticker}/price")
    public ResponseEntity<StockPrice> getPrice(@PathVariable String ticker) {

        StockPrice stockPrice = priceService.getStockPrice(ticker);
        return ResponseEntity.ok(stockPrice);

    }
}
