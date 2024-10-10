package com.maddaxlallatin.stockapi.endpoints;


import com.maddaxlallatin.stockapi.model.Analyst.AnalystRecommendations;
import com.maddaxlallatin.stockapi.service.AnalystRecommendationsService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class AnalystRecommendationsController {

    public final AnalystRecommendationsService analystRecommendationsService;

    @Autowired
    AnalystRecommendationsController(AnalystRecommendationsService analystRecommendationsService){
        this.analystRecommendationsService = analystRecommendationsService;
    }

    @GetMapping("/stock/v1/{ticker}/analyst-recommendations")
    public ResponseEntity<AnalystRecommendations> getAnalystRecommendations(@PathVariable String ticker) {

       AnalystRecommendations analystRecommendations = analystRecommendationsService.getAnalystRecommendations(ticker);
       return ResponseEntity.ok(analystRecommendations);

    }
}
