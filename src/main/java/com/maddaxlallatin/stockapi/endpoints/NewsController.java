package com.maddaxlallatin.stockapi.endpoints;


import com.maddaxlallatin.stockapi.model.StockNews;
import com.maddaxlallatin.stockapi.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class NewsController {

    private final NewsService newsService;

    @Autowired
    public NewsController(NewsService newsService) {
        this.newsService = newsService;
    }

    @GetMapping("/stock/v1/{ticker}/news")
    public ResponseEntity<StockNews> getStockNews(@PathVariable String ticker, @RequestParam(name = "number", required = false, defaultValue = "20") Integer numArticles) {

        StockNews stockNews = newsService.getStockNews(ticker, numArticles);
        return ResponseEntity.ok(stockNews);


    }
}
