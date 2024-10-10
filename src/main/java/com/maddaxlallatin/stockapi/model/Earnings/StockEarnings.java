package com.maddaxlallatin.stockapi.model.Earnings;

import java.util.ArrayList;

public class StockEarnings {
    public String ticker;
    public ArrayList<SingleStockEarnings> stockEarnings;

    public StockEarnings(String ticker, ArrayList<SingleStockEarnings> stockEarnings){
        this.ticker = ticker;
        this.stockEarnings = stockEarnings;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public ArrayList<SingleStockEarnings> getStockEarnings() {
        return stockEarnings;
    }

    public void setStockEarnings(ArrayList<SingleStockEarnings> stockEarnings) {
        this.stockEarnings = stockEarnings;
    }
}
