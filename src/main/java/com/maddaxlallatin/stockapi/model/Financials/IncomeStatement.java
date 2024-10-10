package com.maddaxlallatin.stockapi.model.Financials;

public class IncomeStatement implements Financials {
    private String fiscalYear;
    private Integer totalRevenue;
    private Integer costOfRevenue;
    private Integer grossProfit;
    private Integer operatingExpense;
    private Integer operatingIncome;
    private Integer netNonOperatingInterestExpense;
    private Integer otherIncomeExpense;
    private Integer pretaxIncome;
    private Integer taxProvision;
    private Integer netIncomeCommonStockholders;
    private Integer dilutedNIAvailableToCommonStockholders;
    private Double basicEPS;
    private Double dilutedEPS;
    private Integer basicAverageShares;
    private Integer dilutedAverageShares;
    private Integer totalOperatingIncomeAsReported;
    private Integer totalExpenses;
    private Integer netIncomeFromContinuingAndDiscontinuedOperation;
    private Integer normalizedIncome;
    private Integer interestIncome;
    private Integer interestExpense;
    private Integer netInterestIncome;
    private Integer EBIT;
    private Integer EBITDA;
    private Integer reconciledCostOfRevenue;
    private Integer reconciledDeprecation;
    private Integer netIncomeFromContinuingOperationNetMinorityInterest;
    private Integer normalizedEBITDA;
    private Integer taxRateForCalcs;

    public IncomeStatement(String fiscalYear, Integer totalRevenue, Integer costOfRevenue, Integer grossProfit, Integer operatingExpense, Integer operatingIncome, Integer netNonOperatingInterestExpense, Integer otherIncomeExpense, Integer pretaxIncome, Integer taxProvision, Integer netIncomeCommonStockholders, Integer dilutedNIAvailableToCommonStockholders, Double basicEPS, Double dilutedEPS, Integer basicAverageShares, Integer dilutedAverageShares, Integer totalOperatingIncomeAsReported, Integer totalExpenses, Integer netIncomeFromContinuingAndDiscontinuedOperation, Integer normalizedIncome, Integer interestIncome, Integer interestExpense, Integer netInterestIncome, Integer EBIT, Integer EBITDA, Integer reconciledCostOfRevenue, Integer reconciledDeprecation, Integer netIncomeFromContinuingOperationNetMinorityInterest, Integer normalizedEBITDA, Integer taxRateForCalcs) {
        this.fiscalYear = fiscalYear;
        this.totalRevenue = totalRevenue;
        this.costOfRevenue = costOfRevenue;
        this.grossProfit = grossProfit;
        this.operatingExpense = operatingExpense;
        this.operatingIncome = operatingIncome;
        this.netNonOperatingInterestExpense = netNonOperatingInterestExpense;
        this.otherIncomeExpense = otherIncomeExpense;
        this.pretaxIncome = pretaxIncome;
        this.taxProvision = taxProvision;
        this.netIncomeCommonStockholders = netIncomeCommonStockholders;
        this.dilutedNIAvailableToCommonStockholders = dilutedNIAvailableToCommonStockholders;
        this.basicEPS = basicEPS;
        this.dilutedEPS = dilutedEPS;
        this.basicAverageShares = basicAverageShares;
        this.dilutedAverageShares = dilutedAverageShares;
        this.totalOperatingIncomeAsReported = totalOperatingIncomeAsReported;
        this.totalExpenses = totalExpenses;
        this.netIncomeFromContinuingAndDiscontinuedOperation = netIncomeFromContinuingAndDiscontinuedOperation;
        this.normalizedIncome = normalizedIncome;
        this.interestIncome = interestIncome;
        this.interestExpense = interestExpense;
        this.netInterestIncome = netInterestIncome;
        this.EBIT = EBIT;
        this.EBITDA = EBITDA;
        this.reconciledCostOfRevenue = reconciledCostOfRevenue;
        this.reconciledDeprecation = reconciledDeprecation;
        this.netIncomeFromContinuingOperationNetMinorityInterest = netIncomeFromContinuingOperationNetMinorityInterest;
        this.normalizedEBITDA = normalizedEBITDA;
        this.taxRateForCalcs = taxRateForCalcs;
    }

    public String getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public Integer getTotalRevenue() {
        return totalRevenue;
    }

    public void setTotalRevenue(Integer totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public Integer getCostOfRevenue() {
        return costOfRevenue;
    }

    public void setCostOfRevenue(Integer costOfRevenue) {
        this.costOfRevenue = costOfRevenue;
    }

    public Integer getGrossProfit() {
        return grossProfit;
    }

    public void setGrossProfit(Integer grossProfit) {
        this.grossProfit = grossProfit;
    }

    public Integer getOperatingExpense() {
        return operatingExpense;
    }

    public void setOperatingExpense(Integer operatingExpense) {
        this.operatingExpense = operatingExpense;
    }

    public Integer getOperatingIncome() {
        return operatingIncome;
    }

    public void setOperatingIncome(Integer operatingIncome) {
        this.operatingIncome = operatingIncome;
    }

    public Integer getNetNonOperatingInterestExpense() {
        return netNonOperatingInterestExpense;
    }

    public void setNetNonOperatingInterestExpense(Integer netNonOperatingInterestExpense) {
        this.netNonOperatingInterestExpense = netNonOperatingInterestExpense;
    }

    public Integer getOtherIncomeExpense() {
        return otherIncomeExpense;
    }

    public void setOtherIncomeExpense(Integer otherIncomeExpense) {
        this.otherIncomeExpense = otherIncomeExpense;
    }

    public Integer getPretaxIncome() {
        return pretaxIncome;
    }

    public void setPretaxIncome(Integer pretaxIncome) {
        this.pretaxIncome = pretaxIncome;
    }

    public Integer getTaxProvision() {
        return taxProvision;
    }

    public void setTaxProvision(Integer taxProvision) {
        this.taxProvision = taxProvision;
    }

    public Integer getNetIncomeCommonStockholders() {
        return netIncomeCommonStockholders;
    }

    public void setNetIncomeCommonStockholders(Integer netIncomeCommonStockholders) {
        this.netIncomeCommonStockholders = netIncomeCommonStockholders;
    }

    public Integer getDilutedNIAvailableToCommonStockholders() {
        return dilutedNIAvailableToCommonStockholders;
    }

    public void setDilutedNIAvailableToCommonStockholders(Integer dilutedNIAvailableToCommonStockholders) {
        this.dilutedNIAvailableToCommonStockholders = dilutedNIAvailableToCommonStockholders;
    }

    public Double getBasicEPS() {
        return basicEPS;
    }

    public void setBasicEPS(Double basicEPS) {
        this.basicEPS = basicEPS;
    }

    public Double getDilutedEPS() {
        return dilutedEPS;
    }

    public void setDilutedEPS(Double dilutedEPS) {
        this.dilutedEPS = dilutedEPS;
    }

    public Integer getBasicAverageShares() {
        return basicAverageShares;
    }

    public void setBasicAverageShares(Integer basicAverageShares) {
        this.basicAverageShares = basicAverageShares;
    }

    public Integer getDilutedAverageShares() {
        return dilutedAverageShares;
    }

    public void setDilutedAverageShares(Integer dilutedAverageShares) {
        this.dilutedAverageShares = dilutedAverageShares;
    }

    public Integer getTotalOperatingIncomeAsReported() {
        return totalOperatingIncomeAsReported;
    }

    public void setTotalOperatingIncomeAsReported(Integer totalOperatingIncomeAsReported) {
        this.totalOperatingIncomeAsReported = totalOperatingIncomeAsReported;
    }

    public Integer getTotalExpenses() {
        return totalExpenses;
    }

    public void setTotalExpenses(Integer totalExpenses) {
        this.totalExpenses = totalExpenses;
    }

    public Integer getNetIncomeFromContinuingAndDiscontinuedOperation() {
        return netIncomeFromContinuingAndDiscontinuedOperation;
    }

    public void setNetIncomeFromContinuingAndDiscontinuedOperation(Integer netIncomeFromContinuingAndDiscontinuedOperation) {
        this.netIncomeFromContinuingAndDiscontinuedOperation = netIncomeFromContinuingAndDiscontinuedOperation;
    }

    public Integer getNormalizedIncome() {
        return normalizedIncome;
    }

    public void setNormalizedIncome(Integer normalizedIncome) {
        this.normalizedIncome = normalizedIncome;
    }

    public Integer getInterestIncome() {
        return interestIncome;
    }

    public void setInterestIncome(Integer interestIncome) {
        this.interestIncome = interestIncome;
    }

    public Integer getInterestExpense() {
        return interestExpense;
    }

    public void setInterestExpense(Integer interestExpense) {
        this.interestExpense = interestExpense;
    }

    public Integer getNetInterestIncome() {
        return netInterestIncome;
    }

    public void setNetInterestIncome(Integer netInterestIncome) {
        this.netInterestIncome = netInterestIncome;
    }

    public Integer getEBIT() {
        return EBIT;
    }

    public void setEBIT(Integer EBIT) {
        this.EBIT = EBIT;
    }

    public Integer getEBITDA() {
        return EBITDA;
    }

    public void setEBITDA(Integer EBITDA) {
        this.EBITDA = EBITDA;
    }

    public Integer getReconciledCostOfRevenue() {
        return reconciledCostOfRevenue;
    }

    public void setReconciledCostOfRevenue(Integer reconciledCostOfRevenue) {
        this.reconciledCostOfRevenue = reconciledCostOfRevenue;
    }

    public Integer getReconciledDeprecation() {
        return reconciledDeprecation;
    }

    public void setReconciledDeprecation(Integer reconciledDeprecation) {
        this.reconciledDeprecation = reconciledDeprecation;
    }

    public Integer getNetIncomeFromContinuingOperationNetMinorityInterest() {
        return netIncomeFromContinuingOperationNetMinorityInterest;
    }

    public void setNetIncomeFromContinuingOperationNetMinorityInterest(Integer netIncomeFromContinuingOperationNetMinorityInterest) {
        this.netIncomeFromContinuingOperationNetMinorityInterest = netIncomeFromContinuingOperationNetMinorityInterest;
    }

    public Integer getNormalizedEBITDA() {
        return normalizedEBITDA;
    }

    public void setNormalizedEBITDA(Integer normalizedEBITDA) {
        this.normalizedEBITDA = normalizedEBITDA;
    }

    public Integer getTaxRateForCalcs() {
        return taxRateForCalcs;
    }

    public void setTaxRateForCalcs(Integer taxRateForCalcs) {
        this.taxRateForCalcs = taxRateForCalcs;
    }

}
