package com.maddaxlallatin.stockapi.model.Gainers;

import com.maddaxlallatin.stockapi.model.Trends.SingleTrendingStock;

import java.util.ArrayList;

public class TopGainers {
    private ArrayList<SingleGainer> topGainers;
    public TopGainers(ArrayList<SingleGainer> topGainers){
        this.topGainers = topGainers;
    }

    public ArrayList<SingleGainer> getTopGainers() {
        return topGainers;
    }

    public void setTopGainers(ArrayList<SingleGainer> topGainers) {
        this.topGainers = topGainers;
    }
}
