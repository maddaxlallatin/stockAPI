package com.maddaxlallatin.stockapi.returns;

import java.util.ArrayList;

public class StockHistory{
    private String ticker;
    private ArrayList<StockHistoryDay> history;

    public StockHistory(String ticker, ArrayList<StockHistoryDay> stockHistory){
        this.ticker = ticker;
        this.history = stockHistory;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public ArrayList<StockHistoryDay> getStockHistory() {
        return history;
    }

    public void setStockHistory(ArrayList<StockHistoryDay> stockHistory) {
        this.history = stockHistory;
    }
}
