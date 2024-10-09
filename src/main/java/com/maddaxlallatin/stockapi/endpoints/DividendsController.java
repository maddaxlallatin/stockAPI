package com.maddaxlallatin.stockapi.endpoints;

import com.maddaxlallatin.stockapi.model.StockDividends;
import com.maddaxlallatin.stockapi.service.DividendsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DividendsController {

    public final DividendsService dividendsService;

    @Autowired
    DividendsController(DividendsService dividendsService){
        this.dividendsService = dividendsService;
    }



    @GetMapping("/stock/v1/{ticker}/dividends")
    public ResponseEntity<StockDividends> getStockDividends(@PathVariable String ticker, @RequestParam(name = "number_dividends", required = false, defaultValue = "15") Integer numDividends) {
        StockDividends stockDividends = dividendsService.getStockDividends(ticker, numDividends);
        return ResponseEntity.ok(stockDividends);

    }
}
