package com.maddaxlallatin.stockapi.returns;

import java.util.ArrayList;

public class StockNews {
    private String ticker;
    private ArrayList<NewsArticle> newsArticles;

    public StockNews(String ticker, ArrayList<NewsArticle> newsArticles) {
        this.ticker = ticker;
        this.newsArticles = newsArticles;
    }

    public String getTicker() {
        return ticker;
    }

    public ArrayList<NewsArticle> getNewsArticles() {
        return newsArticles;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setNewsArticles(ArrayList<NewsArticle> newsArticles) {
        this.newsArticles = newsArticles;
    }
}
