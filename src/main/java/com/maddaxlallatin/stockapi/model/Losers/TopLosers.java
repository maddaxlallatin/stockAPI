package com.maddaxlallatin.stockapi.model.Losers;

import java.util.ArrayList;

public class TopLosers {
    private ArrayList<SingleLoser> topGainers;
    public TopLosers(ArrayList<SingleLoser> topGainers){
        this.topGainers = topGainers;
    }

    public ArrayList<SingleLoser> getTopGainers() {
        return topGainers;
    }

    public void setTopGainers(ArrayList<SingleLoser> topGainers) {
        this.topGainers = topGainers;
    }
}
