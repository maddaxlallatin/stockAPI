package com.maddaxlallatin.stockapi.model;

public class singleTrendingStock {
    private String ticker;
    private String companyName;
    private String price;
    private String change;
    private String changePercent;
    private String volume;
    private String averageVolume;
    private String marketCap;
    private String priceEarningsRatio;
    private String yearChangePercent;
    private String dayChart;

    public singleTrendingStock(String ticker, String companyName, String price, String change, String changePercent, String volume, String averageVolume, String marketCap, String priceEarningsRatio, String yearChangePercent, String dayChart) {
        this.ticker = ticker;
        this.companyName = companyName;
        this.price = price;
        this.change = change;
        this.changePercent = changePercent;
        this.volume = volume;
        this.averageVolume = averageVolume;
        this.marketCap = marketCap;
        this.priceEarningsRatio = priceEarningsRatio;
        this.yearChangePercent = yearChangePercent;
        this.dayChart = dayChart;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getChange() {
        return change;
    }

    public void setChange(String change) {
        this.change = change;
    }

    public String getChangePercent() {
        return changePercent;
    }

    public void setChangePercent(String changePercent) {
        this.changePercent = changePercent;
    }

    public String getVolume() {
        return volume;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }

    public String getAverageVolume() {
        return averageVolume;
    }

    public void setAverageVolume(String averageVolume) {
        this.averageVolume = averageVolume;
    }

    public String getMarketCap() {
        return marketCap;
    }

    public void setMarketCap(String marketCap) {
        this.marketCap = marketCap;
    }

    public String getPriceEarningsRatio() {
        return priceEarningsRatio;
    }

    public void setPriceEarningsRatio(String priceEarningsRatio) {
        this.priceEarningsRatio = priceEarningsRatio;
    }

    public String getYearChangePercent() {
        return yearChangePercent;
    }

    public void setYearChangePercent(String yearChangePercent) {
        this.yearChangePercent = yearChangePercent;
    }

    public String getDayChart() {
        return dayChart;
    }

    public void setDayChart(String dayChart) {
        this.dayChart = dayChart;
    }
}
