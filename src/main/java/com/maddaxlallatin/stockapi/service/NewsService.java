package com.maddaxlallatin.stockapi.service;

import com.maddaxlallatin.stockapi.exceptions.InvalidNumberArticlesException;
import com.maddaxlallatin.stockapi.model.SingleNewsArticle;
import com.maddaxlallatin.stockapi.model.StockNews;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;


import java.io.IOException;
import java.util.ArrayList;

@Service
public class NewsService {

    public StockNews getStockNews(String ticker, Integer numArticles) {

        if(numArticles > 20){
            throw new InvalidNumberArticlesException("Invalid Number of Articles Given: Must be 20 or less");
        }
        if (numArticles <= 0){
            throw new InvalidNumberArticlesException("Invalid Number of Articles Given: Must be greater than 0");
        }


        try {
            String url = "https://finance.yahoo.com/quote/%s/news/".formatted(ticker);
            Document doc = Jsoup.connect(url).get();
            Elements newsContainer = doc.getElementsByClass("container yf-hvsrhi");
            Elements newsArticles = newsContainer.first().getElementsByClass("stream-item story-item yf-1usaaz9");
            ArrayList<SingleNewsArticle> newList = new ArrayList<>();


            for(int i = 0; i < numArticles; i++){
                Element thisArticle = newsArticles.get(i);
                String articleLink = thisArticle.select("a").first().attr("href");
                String articleTitle = thisArticle.select("h3").first().text();
                String articleDescription = thisArticle.select("p").first().text();
                SingleNewsArticle singleNewsArticle = new SingleNewsArticle(articleTitle, articleDescription, articleLink);

                newList.add(singleNewsArticle);
            }

            return new StockNews(ticker, newList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
