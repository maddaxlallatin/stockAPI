package com.maddaxlallatin.stockapi.returns;

import java.util.ArrayList;

public class AnalystRecommendations {
    private String ticker;
    private ArrayList<AnalystRecommendation> analystRecommendations;

    public AnalystRecommendations(String ticker, ArrayList<AnalystRecommendation> analystRecommendations) {
        this.ticker = ticker;
        this.analystRecommendations = analystRecommendations;
    }

    public String getTicker() {
        return ticker;
    }

    public ArrayList<AnalystRecommendation> getAnalystRecommendations() {
        return analystRecommendations;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setAnalystRecommendations(ArrayList<AnalystRecommendation> analystRecommendations) {
        this.analystRecommendations = analystRecommendations;
    }
}
