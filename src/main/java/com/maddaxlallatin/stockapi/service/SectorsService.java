package com.maddaxlallatin.stockapi.service;

import com.maddaxlallatin.stockapi.model.Sectors.Sectors;
import com.maddaxlallatin.stockapi.model.Sectors.SingleSector;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class SectorsService {

    public Sectors getSectors(){
        try {
            String url = "https://finance.yahoo.com/sectors/";
            Document doc = Jsoup.connect(url).get();
            Element tableBody = doc.selectFirst("tbody");
            Elements tableRows = tableBody.select("tr");
            ArrayList<SingleSector> sectorArrayList = new ArrayList<>();
            for(int i = 1; i< tableRows.size(); i++){
                Element thisRow = tableRows.get(i);
                String sectorName = thisRow.selectFirst(".name").text();
                String sectorWeight = thisRow.selectFirst(".barContainer").selectFirst("span").text();
                Element ytdReturnElement = thisRow.selectFirst(".disappear");
                String ytdReturn;
                if(ytdReturnElement.hasClass("positive")){
                    ytdReturn = "+" + ytdReturnElement.text();
                } else {
                    ytdReturn = "-" + ytdReturnElement.text();

                }

                sectorArrayList.add(new SingleSector(sectorName, sectorWeight, ytdReturn));
            }
            return new Sectors(sectorArrayList);

        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
