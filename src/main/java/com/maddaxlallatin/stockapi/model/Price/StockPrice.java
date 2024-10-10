package com.maddaxlallatin.stockapi.model.Price;

public class StockPrice{
    private String ticker;
    private String price;
    String dayHigh;
    String dayLow;
    String yearHigh;
    String yearLow;
    String volume;

    public StockPrice(String ticker, String price, String dayHigh, String dayLow, String yearHigh, String yearLow, String volume) {
        this.ticker = ticker;
        this.price = price;
        this.dayHigh = dayHigh;
        this.dayLow = dayLow;
        this.yearHigh = yearHigh;
        this.yearLow = yearLow;
        this.volume = volume;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getDayHigh() {
        return dayHigh;
    }

    public void setDayHigh(String dayHigh) {
        this.dayHigh = dayHigh;
    }

    public String getDayLow() {
        return dayLow;
    }

    public void setDayLow(String dayLow) {
        this.dayLow = dayLow;
    }

    public String getYearHigh() {
        return yearHigh;
    }

    public void setYearHigh(String yearHigh) {
        this.yearHigh = yearHigh;
    }

    public String getYearLow() {
        return yearLow;
    }

    public void setYearLow(String yearLow) {
        this.yearLow = yearLow;
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
