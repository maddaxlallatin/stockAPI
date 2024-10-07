package com.maddaxlallatin.stockapi.endpoints;

import com.maddaxlallatin.stockapi.exceptions.InvalidAnalystException;
import com.maddaxlallatin.stockapi.exceptions.InvalidDateException;
import com.maddaxlallatin.stockapi.returns.AnalystRecommendation;
import com.maddaxlallatin.stockapi.returns.AnalystRecommendations;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public class AnalystRecommendationsController {

    @GetMapping("/stock/v1/{ticker}/analyst-recommendations")
    public AnalystRecommendations getAnalystRecommendations(@PathVariable String ticker) {
        try {
            String url = "https://finance.yahoo.com/quote/%s/analysis/".formatted(ticker);
            Document doc = Jsoup.connect(url).get();
            if(doc.select("#top-analyst").first() == null){
                throw new InvalidAnalystException("Analyst Recommendations Not Available for " + ticker);
            }
            Elements analystTable = doc.select("#top-analyst").first().getElementsByTag("tbody").first().getElementsByTag("tr");

            ArrayList<AnalystRecommendation> analystRecommendations = new ArrayList<>();

            for (Element row : analystTable) {

                Elements values = row.getElementsByTag("td");
                ArrayList<String> tableRow = new ArrayList<>();

                for (Element value : values) {
                    tableRow.add(value.text());
                }
                AnalystRecommendation analystRecommendation = new AnalystRecommendation(tableRow.get(0), tableRow.get(1), tableRow.get(2), tableRow.get(3), tableRow.get(4), tableRow.get(5), tableRow.get(6));
                analystRecommendations.add(analystRecommendation);
            }
            return new AnalystRecommendations(ticker, analystRecommendations);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
