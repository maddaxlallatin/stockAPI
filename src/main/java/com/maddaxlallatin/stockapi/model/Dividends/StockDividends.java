package com.maddaxlallatin.stockapi.model.Dividends;

import java.util.ArrayList;

public class StockDividends {
    private String ticker;
    private ArrayList<SingleStockDividends> stockDividends;

    public StockDividends(String ticker, ArrayList<SingleStockDividends> stockDividends){
        this.ticker = ticker;
        this.stockDividends = stockDividends;
    }

    public ArrayList<SingleStockDividends> getStockDividends() {
        return stockDividends;
    }

    public void setStockDividends(ArrayList<SingleStockDividends> stockDividends) {
        this.stockDividends = stockDividends;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }
}
