package com.maddaxlallatin.stockapi.model.Financials;

import java.util.ArrayList;

public class StockFinancials {
    private String ticker;
    private ArrayList<Financials> stockFinancials;

    public StockFinancials(String ticker, ArrayList<Financials> stockFinancials) {
        this.ticker = ticker;
        this.stockFinancials = stockFinancials;
    }

    public ArrayList<Financials> getStockFinancials() {
        return stockFinancials;
    }

    public void setStockFinancials(ArrayList<Financials> stockFinancials) {
        this.stockFinancials = stockFinancials;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }
}
