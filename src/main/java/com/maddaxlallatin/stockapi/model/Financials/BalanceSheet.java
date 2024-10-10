package com.maddaxlallatin.stockapi.model.Financials;

public class BalanceSheet implements Financials {
    private String fiscalYear;
    private Integer totalAssets;
    private Integer totalLiabilitiesNetMinorityInterest;
    private Integer totalEquityGrossMinorityInterest;
    private Integer totalCapitalization;
    private Integer commonStockEquity;
    private Integer capitalLeaseObligations;
    private Integer netTangibleAssets;
    private Integer workingCapital;
    private Integer investedCapital;
    private Integer tangibleBookValue;
    private Integer totalDebt;
    private Integer netDebt;
    private Integer shareIssued;
    private Integer ordinarySharesNumber;

    public BalanceSheet(String fiscalYear, Integer totalAssets, Integer totalLiabilitiesNetMinorityInterest, Integer totalEquityGrossMinorityInterest, Integer totalCapitalization, Integer commonStockEquity, Integer capitalLeaseObligations, Integer netTangibleAssets, Integer workingCapital, Integer investedCapital, Integer tangibleBookValue, Integer totalDebt, Integer netDebt, Integer shareIssued, Integer ordinarySharesNumber) {
        this.fiscalYear = fiscalYear;
        this.totalAssets = totalAssets;
        this.totalLiabilitiesNetMinorityInterest = totalLiabilitiesNetMinorityInterest;
        this.totalEquityGrossMinorityInterest = totalEquityGrossMinorityInterest;
        this.totalCapitalization = totalCapitalization;
        this.commonStockEquity = commonStockEquity;
        this.capitalLeaseObligations = capitalLeaseObligations;
        this.netTangibleAssets = netTangibleAssets;
        this.workingCapital = workingCapital;
        this.investedCapital = investedCapital;
        this.tangibleBookValue = tangibleBookValue;
        this.totalDebt = totalDebt;
        this.netDebt = netDebt;
        this.shareIssued = shareIssued;
        this.ordinarySharesNumber = ordinarySharesNumber;
    }

    public String getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public Integer getTotalAssets() {
        return totalAssets;
    }

    public void setTotalAssets(Integer totalAssets) {
        this.totalAssets = totalAssets;
    }

    public Integer getTotalLiabilitiesNetMinorityInterest() {
        return totalLiabilitiesNetMinorityInterest;
    }

    public void setTotalLiabilitiesNetMinorityInterest(Integer totalLiabilitiesNetMinorityInterest) {
        this.totalLiabilitiesNetMinorityInterest = totalLiabilitiesNetMinorityInterest;
    }

    public Integer getTotalEquityGrossMinorityInterest() {
        return totalEquityGrossMinorityInterest;
    }

    public void setTotalEquityGrossMinorityInterest(Integer totalEquityGrossMinorityInterest) {
        this.totalEquityGrossMinorityInterest = totalEquityGrossMinorityInterest;
    }

    public Integer getTotalCapitalization() {
        return totalCapitalization;
    }

    public void setTotalCapitalization(Integer totalCapitalization) {
        this.totalCapitalization = totalCapitalization;
    }

    public Integer getCommonStockEquity() {
        return commonStockEquity;
    }

    public void setCommonStockEquity(Integer commonStockEquity) {
        this.commonStockEquity = commonStockEquity;
    }

    public Integer getcapitalLeaseObligations() {
        return capitalLeaseObligations;
    }

    public void setcapitalLeaseObligations(Integer capitalLeaseObligations) {
        capitalLeaseObligations = capitalLeaseObligations;
    }

    public Integer getNetTangibleAssets() {
        return netTangibleAssets;
    }

    public void setNetTangibleAssets(Integer netTangibleAssets) {
        this.netTangibleAssets = netTangibleAssets;
    }

    public Integer getWorkingCapital() {
        return workingCapital;
    }

    public void setWorkingCapital(Integer workingCapital) {
        this.workingCapital = workingCapital;
    }

    public Integer getInvestedCapital() {
        return investedCapital;
    }

    public void setInvestedCapital(Integer investedCapital) {
        this.investedCapital = investedCapital;
    }

    public Integer getTangibleBookValue() {
        return tangibleBookValue;
    }

    public void setTangibleBookValue(Integer tangibleBookValue) {
        this.tangibleBookValue = tangibleBookValue;
    }

    public Integer getTotalDebt() {
        return totalDebt;
    }

    public void setTotalDebt(Integer totalDebt) {
        this.totalDebt = totalDebt;
    }

    public Integer getNetDebt() {
        return netDebt;
    }

    public void setNetDebt(Integer netDebt) {
        this.netDebt = netDebt;
    }

    public Integer getShareIssued() {
        return shareIssued;
    }

    public void setShareIssued(Integer shareIssued) {
        this.shareIssued = shareIssued;
    }

    public Integer getOrdinarySharesNumber() {
        return ordinarySharesNumber;
    }

    public void setOrdinarySharesNumber(Integer ordinarySharesNumber) {
        this.ordinarySharesNumber = ordinarySharesNumber;
    }
}
