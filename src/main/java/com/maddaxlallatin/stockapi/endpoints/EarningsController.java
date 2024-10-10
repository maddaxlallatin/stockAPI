package com.maddaxlallatin.stockapi.endpoints;

import com.maddaxlallatin.stockapi.model.Earnings.StockEarnings;
import com.maddaxlallatin.stockapi.service.EarningsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EarningsController {
    public EarningsService earningsService;

    @Autowired
    public EarningsController(EarningsService earningsService){
        this.earningsService = earningsService;
    }

    @GetMapping("/stock/v1/{ticker}/earnings")
    public ResponseEntity<StockEarnings> getStockEarnings(@PathVariable String ticker){
        StockEarnings stockEarnings = earningsService.getStockEarnings(ticker);
        return ResponseEntity.ok(stockEarnings);
    }

}
