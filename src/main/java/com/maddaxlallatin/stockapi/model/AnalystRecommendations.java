package com.maddaxlallatin.stockapi.model;

import java.util.ArrayList;

public class AnalystRecommendations {
    private String ticker;
    private ArrayList<SingleAnalystRecommendation> singleAnalystRecommendations;

    public AnalystRecommendations(String ticker, ArrayList<SingleAnalystRecommendation> singleAnalystRecommendations) {
        this.ticker = ticker;
        this.singleAnalystRecommendations = singleAnalystRecommendations;
    }

    public String getTicker() {
        return ticker;
    }

    public ArrayList<SingleAnalystRecommendation> getAnalystRecommendations() {
        return singleAnalystRecommendations;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setAnalystRecommendations(ArrayList<SingleAnalystRecommendation> singleAnalystRecommendations) {
        this.singleAnalystRecommendations = singleAnalystRecommendations;
    }
}
