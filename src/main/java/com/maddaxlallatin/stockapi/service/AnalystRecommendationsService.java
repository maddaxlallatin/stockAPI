package com.maddaxlallatin.stockapi.service;

import com.maddaxlallatin.stockapi.exceptions.InvalidAnalystException;
import com.maddaxlallatin.stockapi.model.Analyst.AnalystRecommendations;
import com.maddaxlallatin.stockapi.model.Analyst.SingleAnalystRecommendation;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class AnalystRecommendationsService {

    public AnalystRecommendations getAnalystRecommendations(String ticker){
        try {
            String url = "https://finance.yahoo.com/quote/%s/analysis/".formatted(ticker);
            Document doc = Jsoup.connect(url).get();
            if(doc.select("#top-analyst").first() == null){
                throw new InvalidAnalystException("Analyst Recommendations Not Available for " + ticker);
            }
            Elements analystTable = doc.select("#top-analyst").first().getElementsByTag("tbody").first().getElementsByTag("tr");

            ArrayList<SingleAnalystRecommendation> singleAnalystRecommendations = new ArrayList<>();

            for (Element row : analystTable) {

                Elements values = row.getElementsByTag("td");
                ArrayList<String> tableRow = new ArrayList<>();

                for (Element value : values) {
                    tableRow.add(value.text());
                }
                SingleAnalystRecommendation singleAnalystRecommendation = new SingleAnalystRecommendation(tableRow.get(0), tableRow.get(1), tableRow.get(2), tableRow.get(3), tableRow.get(4), tableRow.get(5), tableRow.get(6));
                singleAnalystRecommendations.add(singleAnalystRecommendation);
            }
            return new AnalystRecommendations(ticker, singleAnalystRecommendations);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
