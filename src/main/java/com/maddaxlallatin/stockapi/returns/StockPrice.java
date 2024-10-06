package com.maddaxlallatin.stockapi.returns;

public class StockPrice {
    private String ticker;
    private String price;

    public StockPrice(String ticker, String price){
        this.ticker =ticker;
        this.price = price;
    }

    public String getPrice() {
        return price;
    }

    public String getTicker() {
        return ticker;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }
}
