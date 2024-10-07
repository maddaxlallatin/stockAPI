package com.maddaxlallatin.stockapi.endpoints;

import com.maddaxlallatin.stockapi.returns.StockProfile;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ProfileController {
    @GetMapping("/stock/v1/{ticker}/profile")
    public StockProfile getStockProfile(@PathVariable String ticker) {
        try {
            String url = "https://finance.yahoo.com/quote/%s/profile/".formatted(ticker);
            Document doc = Jsoup.connect(url).get();
            Elements companyStats = doc.select(".company-stats");
            String companySector = companyStats.first().select("a").text();
            String companySize = companyStats.first().select("strong").text();
            String companyIndustry = companyStats.first().getElementsByTag("a").last().text();
            String companyName = doc.select("h3.header.yf-13lpgjv").eq(1).text();
            String ceoName = doc.select("tbody").first().getElementsByTag("tr").first().getElementsByTag("td").first().text();

            return new StockProfile(ticker, companyName, companySector, companyIndustry, ceoName, companySize);
        } catch (IOException e) {
            throw new RuntimeException(e);

        }
    }
}
