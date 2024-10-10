package com.maddaxlallatin.stockapi.endpoints;

import com.maddaxlallatin.stockapi.model.Losers.TopLosers;
import com.maddaxlallatin.stockapi.service.LosersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LosersController {
    private LosersService losersService;

    @Autowired
    public LosersController(LosersService losersService){
        this.losersService = losersService;
    }

    @GetMapping("/stock/v1/losers")
    public ResponseEntity<TopLosers> getLosers(){
        TopLosers topLosers = losersService.getLosers();
        return ResponseEntity.ok(topLosers);
    }
}
