package com.maddaxlallatin.stockapi.model.History;

public class SingleStockHistory {
    private String date;
    private String open;
    private String high;
    private String low;
    private String close;
    private String adjustedClose;
    private String volume;

    public SingleStockHistory(String date, String open, String high, String low, String close, String adjustedClose, String volume) {
        this.date = date;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.adjustedClose = adjustedClose;
        this.volume = volume;
    }

    public String getDate() {
        return date;
    }

    public String getOpen() {
        return open;
    }

    public String getHigh() {
        return high;
    }

    public String getLow() {
        return low;
    }

    public String getClose() {
        return close;
    }

    public String getAdjustedClose() {
        return adjustedClose;
    }

    public String getVolume() {
        return volume;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setOpen(String open) {
        this.open = open;
    }

    public void setHigh(String high) {
        this.high = high;
    }

    public void setLow(String low) {
        this.low = low;
    }

    public void setClose(String close) {
        this.close = close;
    }

    public void setAdjustedClose(String adjustedClose) {
        this.adjustedClose = adjustedClose;
    }

    public void setVolume(String volume) {
        this.volume = volume;
    }
}
