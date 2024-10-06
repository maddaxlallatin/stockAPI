package com.maddaxlallatin.stockapi.endpoints;

import com.maddaxlallatin.stockapi.exceptions.InvalidNumberArticlesException;
import com.maddaxlallatin.stockapi.returns.NewsArticle;
import com.maddaxlallatin.stockapi.returns.StockNews;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;


@RestController
public class NewsController {
    @GetMapping("/stock/v1/{ticker}/news")
    public StockNews getStockNews(@PathVariable String ticker, @RequestParam(name = "number", required = false, defaultValue = "20") Integer numArticles) {

            System.out.println(numArticles);
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
            ArrayList<NewsArticle> newList = new ArrayList<>();


            for(int i = 0; i < numArticles; i++){
                Element thisArticle = newsArticles.get(i);
                String articleLink = thisArticle.select("a").first().attr("href");
                String articleTitle = thisArticle.select("h3").first().text();
                String articleDescription = thisArticle.select("p").first().text();
                NewsArticle newsArticle = new NewsArticle(articleTitle, articleDescription, articleLink);

                newList.add(newsArticle);
            }

            return new StockNews(ticker, newList);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
