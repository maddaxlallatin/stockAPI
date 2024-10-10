package com.maddaxlallatin.stockapi.model.History;

import java.util.ArrayList;

public class StockHistory{
    private String ticker;
    private ArrayList<SingleStockHistory> history;

    public StockHistory(String ticker, ArrayList<SingleStockHistory> stockHistory){
        this.ticker = ticker;
        this.history = stockHistory;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public ArrayList<SingleStockHistory> getStockHistory() {
        return history;
    }

    public void setStockHistory(ArrayList<SingleStockHistory> stockHistory) {
        this.history = stockHistory;
    }
}
