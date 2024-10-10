package com.maddaxlallatin.stockapi.endpoints;

import com.maddaxlallatin.stockapi.model.Gainers.TopGainers;
import com.maddaxlallatin.stockapi.service.GainersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GainersController {
    private GainersService gainersService;

    @Autowired
    public GainersController(GainersService gainersService){
        this.gainersService = gainersService;
    }

    @GetMapping("/stock/v1/gainers")
    public ResponseEntity<TopGainers> getGainers(){
        TopGainers topGainers = gainersService.getGainers();
        return ResponseEntity.ok(topGainers);
    }
}
