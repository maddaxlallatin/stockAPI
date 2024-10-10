package com.maddaxlallatin.stockapi.endpoints;

import com.maddaxlallatin.stockapi.model.Profile.StockProfile;
import com.maddaxlallatin.stockapi.service.ProfileService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProfileController {

    public final ProfileService profileService;
    @Autowired
    public ProfileController(ProfileService profileService){
        this.profileService = profileService;
    }

    @GetMapping("/stock/v1/{ticker}/profile")
    public ResponseEntity<StockProfile> getStockProfile(@PathVariable String ticker) {
        StockProfile stockProfile = profileService.getStockProfile(ticker);
        return ResponseEntity.ok(stockProfile);
    }
}
