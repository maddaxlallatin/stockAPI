package com.maddaxlallatin.stockapi.endpoints;

import com.maddaxlallatin.stockapi.model.TrendingStocks;
import com.maddaxlallatin.stockapi.service.TrendingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrendingController {
    public final TrendingService trendingService;

    @Autowired
    public TrendingController(TrendingService trendingService){
        this.trendingService = trendingService;
    }

    @GetMapping("/stock/v1/trending")
    public ResponseEntity<TrendingStocks> getTrendingStocks(){
        TrendingStocks trendingStocks = trendingService.getTrendingStocks();
        return ResponseEntity.ok(trendingStocks);
    }
}
