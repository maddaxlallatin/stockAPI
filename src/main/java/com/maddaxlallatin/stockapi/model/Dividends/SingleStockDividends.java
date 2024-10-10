package com.maddaxlallatin.stockapi.model.Dividends;

public class SingleStockDividends {
    private String date;
    private String dividend;

    public SingleStockDividends( String date, String dividend) {
        this.date = date;
        this.dividend = dividend;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDividend() {
        return dividend;
    }

    public void setDividend(String dividend) {
        this.dividend = dividend;
    }
}
