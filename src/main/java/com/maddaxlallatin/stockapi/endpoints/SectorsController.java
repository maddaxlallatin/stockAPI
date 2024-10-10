package com.maddaxlallatin.stockapi.endpoints;

import com.maddaxlallatin.stockapi.model.Sectors.Sectors;
import com.maddaxlallatin.stockapi.service.SectorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SectorsController {
    private SectorsService sectorsService;

    @Autowired
    public SectorsController(SectorsService sectorsService){
        this.sectorsService = sectorsService;
    }

    @GetMapping("/stock/v1/sectors")
    public ResponseEntity<Sectors> getSectors(){
        Sectors sectors = sectorsService.getSectors();
        return ResponseEntity.ok(sectors);
    }
}
