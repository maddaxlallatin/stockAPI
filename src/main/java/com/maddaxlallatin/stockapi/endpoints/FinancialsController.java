package com.maddaxlallatin.stockapi.endpoints;

import com.maddaxlallatin.stockapi.model.Financials.StockFinancials;
import com.maddaxlallatin.stockapi.service.FinancialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinancialsController {

    private final FinancialsService financialsService;

    @Autowired
    FinancialsController(FinancialsService financialsService){
        this.financialsService = financialsService;
    }

    @GetMapping("/stock/v1/{ticker}/financials")
    public ResponseEntity<StockFinancials> getStockFinancials(@PathVariable String ticker, @RequestParam(name = "income_statement", defaultValue = "true", required = false) Boolean incomeStatement , @RequestParam(name = "balance_sheet", defaultValue = "true", required = false) Boolean balanceSheet, @RequestParam(name = "cash_flow", defaultValue = "true", required = false) Boolean cashFlow){
        StockFinancials stockFinancials = financialsService.getStockFinancials(ticker, incomeStatement, balanceSheet, cashFlow);
        return ResponseEntity.ok(stockFinancials);
    }


}
