package com.maddaxlallatin.stockapi.model.News;

import java.util.ArrayList;

public class StockNews {
    private String ticker;
    private ArrayList<SingleNewsArticle> singleNewsArticles;

    public StockNews(String ticker, ArrayList<SingleNewsArticle> singleNewsArticles) {
        this.ticker = ticker;
        this.singleNewsArticles = singleNewsArticles;
    }

    public String getTicker() {
        return ticker;
    }

    public ArrayList<SingleNewsArticle> getNewsArticles() {
        return singleNewsArticles;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setNewsArticles(ArrayList<SingleNewsArticle> singleNewsArticles) {
        this.singleNewsArticles = singleNewsArticles;
    }
}
