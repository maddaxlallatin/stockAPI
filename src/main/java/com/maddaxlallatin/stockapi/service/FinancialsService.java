package com.maddaxlallatin.stockapi.service;

import com.maddaxlallatin.stockapi.model.Financials.*;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

@Service
public class FinancialsService {
    public StockFinancials getStockFinancials(String ticker, boolean incomeStatement, boolean balanceSheet, boolean cashFlow){
        ArrayList<Financials> stockFinancials = new ArrayList<>();
        if(incomeStatement) stockFinancials.add(getIncomeStatement(ticker));
        if(balanceSheet) stockFinancials.add(getBalanceSheet(ticker));
        if(cashFlow) stockFinancials.add(getCashFlow(ticker));


        return new StockFinancials(ticker, stockFinancials);
    }
    private Financials getIncomeStatement(String ticker){
        try {
            ArrayList<Double> incomeStatementArray = new ArrayList<>();
            String url = "https://finance.yahoo.com/quote/%s/financials/".formatted(ticker);
            Document doc = Jsoup.connect(url).get();
            Element tableHeader = doc.selectFirst(".tableHeader.yf-1pgoo1f");
            String fiscalYear = tableHeader.selectFirst(".row.yf-1ezv2n5").select(".column.yf-1ezv2n5").get(2).text().split("/")[2];
            Element tableBody = doc.selectFirst(".tableBody.yf-1pgoo1f");
            Elements tableRows = tableBody.select(".row.lv-0.yf-1xjz32c");
            for(Element row : tableRows){
                String data = row.select(".column.yf-1xjz32c").get(2).text();
                if(data.equals("--")){
                    incomeStatementArray.add(null);
                }else {
                    incomeStatementArray.add(Double.parseDouble(data.replace(",", "")));
                }
            }
            return new IncomeStatement(fiscalYear, incomeStatementArray.get(0).intValue(), incomeStatementArray.get(1).intValue(), incomeStatementArray.get(2).intValue(), incomeStatementArray.get(3).intValue(), incomeStatementArray.get(4).intValue(), incomeStatementArray.get(5).intValue(), incomeStatementArray.get(6).intValue(), incomeStatementArray.get(7).intValue(), incomeStatementArray.get(8).intValue(), incomeStatementArray.get(9).intValue(), incomeStatementArray.get(10).intValue(), incomeStatementArray.get(11), incomeStatementArray.get(12), incomeStatementArray.get(13).intValue(), incomeStatementArray.get(14).intValue(), incomeStatementArray.get(15).intValue(), incomeStatementArray.get(16).intValue(), incomeStatementArray.get(17).intValue(), incomeStatementArray.get(18).intValue(), incomeStatementArray.get(19).intValue(), incomeStatementArray.get(20).intValue(), incomeStatementArray.get(21).intValue(), incomeStatementArray.get(22).intValue(), incomeStatementArray.get(23).intValue(), incomeStatementArray.get(24).intValue(), incomeStatementArray.get(25).intValue(), incomeStatementArray.get(26).intValue(), incomeStatementArray.get(27).intValue(), incomeStatementArray.get(28).intValue());

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    private Financials getBalanceSheet(String ticker){
        try{
            ArrayList<Integer> balanceSheetArray = new ArrayList<>();
            String url = "https://finance.yahoo.com/quote/%s/balance-sheet/".formatted(ticker);
            Document doc = Jsoup.connect(url).get();
            Element tableHeader = doc.selectFirst(".tableHeader.yf-1pgoo1f");
            String fiscalYear = tableHeader.selectFirst(".row.yf-1ezv2n5").select(".column.yf-1ezv2n5").get(1).text().split("/")[2];
            Element tableBody = doc.selectFirst(".tableBody.yf-1pgoo1f");
            Elements tableRows = tableBody.select(".row.lv-0.yf-1xjz32c");

            for(Element rows : tableRows){
                String data = rows.select(".column.yf-1xjz32c").get(1).text();
                if(data.equals("--")){
                    balanceSheetArray.add(null);
                }else {
                    Double doublenNum =  Double.parseDouble(data.replace(",", ""));
                    balanceSheetArray.add(doublenNum.intValue());
                }
            }
            return new BalanceSheet(fiscalYear, balanceSheetArray.get(0), balanceSheetArray.get(1), balanceSheetArray.get(2), balanceSheetArray.get(3), balanceSheetArray.get(4), balanceSheetArray.get(5), balanceSheetArray.get(6), balanceSheetArray.get(7), balanceSheetArray.get(8), balanceSheetArray.get(9), balanceSheetArray.get(10), balanceSheetArray.get(11), balanceSheetArray.get(12), balanceSheetArray.get(13));

        }catch(IOException e){
            throw new RuntimeException(e);
        }

    }
    private Financials getCashFlow(String ticker){
        try {
            ArrayList<Integer> cashFlowsArray = new ArrayList<>();
            String url = "https://finance.yahoo.com/quote/%s/cash-flow/".formatted(ticker);
            Document doc = Jsoup.connect(url).get();
            Element tableHeader = doc.selectFirst(".tableHeader.yf-1pgoo1f");
            String fiscalYear = tableHeader.selectFirst(".row.yf-1ezv2n5").select(".column.yf-1ezv2n5").get(2).text().split("/")[2];
            Element tableBody = doc.selectFirst(".tableBody.yf-1pgoo1f");
            Elements tableRows = tableBody.select(".row.lv-0.yf-1xjz32c");
            for(Element row : tableRows){
                String data = row.select(".column.yf-1xjz32c").get(2).text();
                if(data.equals("--")){
                    cashFlowsArray.add(null);
                }else {
                    Double doubleNum =  Double.parseDouble(data.replace(",", ""));
                    cashFlowsArray.add(doubleNum.intValue());
                }
            }
            return new CashFlow(fiscalYear, cashFlowsArray.get(0), cashFlowsArray.get(1), cashFlowsArray.get(2), cashFlowsArray.get(3), cashFlowsArray.get(4), cashFlowsArray.get(5), cashFlowsArray.get(6), cashFlowsArray.get(7), cashFlowsArray.get(8), cashFlowsArray.get(9), cashFlowsArray.get(10), cashFlowsArray.get(11));

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
