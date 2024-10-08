package com.maddaxlallatin.stockapi.endpoints;

import com.maddaxlallatin.stockapi.model.History.StockHistory;
import com.maddaxlallatin.stockapi.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HistoryController {

    public final HistoryService historyService;

    @Autowired
    HistoryController(HistoryService historyService){
        this.historyService = historyService;
    }



    @GetMapping("/stock/v1/{ticker}/history")
    public ResponseEntity<StockHistory> getStockHistory(@PathVariable String ticker, @RequestParam(name = "start_date", required = false) String startDate, @RequestParam(name = "end_date", required = false) String endDate) {
        StockHistory stockHistory = historyService.getStockHistory(ticker, startDate, endDate);
        return ResponseEntity.ok(stockHistory);

    }
}
