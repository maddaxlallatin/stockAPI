package com.maddaxlallatin.stockapi.model.Trends;

import java.util.ArrayList;

public class TrendingStocks {
    private ArrayList<SingleTrendingStock> trendingStocks;
    public TrendingStocks(ArrayList<SingleTrendingStock> trendingStocks){
    this.trendingStocks = trendingStocks;
    }

    public ArrayList<SingleTrendingStock> getTrendingStocks() {
        return trendingStocks;
    }

    public void setTrendingStocks(ArrayList<SingleTrendingStock> trendingStocks) {
        this.trendingStocks = trendingStocks;
    }

}
