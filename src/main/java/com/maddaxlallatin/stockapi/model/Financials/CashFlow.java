package com.maddaxlallatin.stockapi.model.Financials;

public class CashFlow implements Financials {
    private String fiscalYear;
    private Integer operatingCashFlow;
    private Integer investingCashFlow;
    private Integer financingCashFlow;
    private Integer endCashPosition;
    private Integer incomeTaxPaidSupplementalData;
    private Integer interestPaidSupplementalData;
    private Integer capitalExpenditure;
    private Integer issuanceOfCapitalStock;
    private Integer issuanceOfDebt;
    private Integer repaymentOfDebt;
    private Integer repurchaseOfCapitalStock;
    private Integer freeCashFlow;

    public CashFlow(String fiscalYear, Integer operatingCashFlow, Integer investingCashFlow, Integer financingCashFlow, Integer endCashPosition, Integer incomeTaxPaidSupplementalData, Integer interestPaidSupplementalData, Integer capitalExpenditure, Integer issuanceOfCapitalStock, Integer issuanceOfDebt, Integer repaymentOfDebt, Integer repurchaseOfCapitalStock, Integer freeCashFlow) {
        this.fiscalYear = fiscalYear;
        this.operatingCashFlow = operatingCashFlow;
        this.investingCashFlow = investingCashFlow;
        this.financingCashFlow = financingCashFlow;
        this.endCashPosition = endCashPosition;
        this.incomeTaxPaidSupplementalData = incomeTaxPaidSupplementalData;
        this.interestPaidSupplementalData = interestPaidSupplementalData;
        this.capitalExpenditure = capitalExpenditure;
        this.issuanceOfCapitalStock = issuanceOfCapitalStock;
        this.issuanceOfDebt = issuanceOfDebt;
        this.repaymentOfDebt = repaymentOfDebt;
        this.repurchaseOfCapitalStock = repurchaseOfCapitalStock;
        this.freeCashFlow = freeCashFlow;
    }

    public String getFiscalYear() {
        return fiscalYear;
    }

    public void setFiscalYear(String fiscalYear) {
        this.fiscalYear = fiscalYear;
    }

    public Integer getOperatingCashFlow() {
        return operatingCashFlow;
    }

    public void setOperatingCashFlow(Integer operatingCashFlow) {
        this.operatingCashFlow = operatingCashFlow;
    }

    public Integer getInvestingCashFlow() {
        return investingCashFlow;
    }

    public void setInvestingCashFlow(Integer investingCashFlow) {
        this.investingCashFlow = investingCashFlow;
    }

    public Integer getFinancingCashFlow() {
        return financingCashFlow;
    }

    public void setFinancingCashFlow(Integer financingCashFlow) {
        this.financingCashFlow = financingCashFlow;
    }

    public Integer getEndCashPosition() {
        return endCashPosition;
    }

    public void setEndCashPosition(Integer endCashPosition) {
        this.endCashPosition = endCashPosition;
    }

    public Integer getIncomeTaxPaidSupplementalData() {
        return incomeTaxPaidSupplementalData;
    }

    public void setIncomeTaxPaidSupplementalData(Integer incomeTaxPaidSupplementalData) {
        this.incomeTaxPaidSupplementalData = incomeTaxPaidSupplementalData;
    }

    public Integer getInterestPaidSupplementalData() {
        return interestPaidSupplementalData;
    }

    public void setInterestPaidSupplementalData(Integer interestPaidSupplementalData) {
        this.interestPaidSupplementalData = interestPaidSupplementalData;
    }

    public Integer getCapitalExpenditure() {
        return capitalExpenditure;
    }

    public void setCapitalExpenditure(Integer capitalExpenditure) {
        this.capitalExpenditure = capitalExpenditure;
    }

    public Integer getIssuanceOfCapitalStock() {
        return issuanceOfCapitalStock;
    }

    public void setIssuanceOfCapitalStock(Integer issuanceOfCapitalStock) {
        this.issuanceOfCapitalStock = issuanceOfCapitalStock;
    }

    public Integer getIssuanceOfDebt() {
        return issuanceOfDebt;
    }

    public void setIssuanceOfDebt(Integer issuanceOfDebt) {
        this.issuanceOfDebt = issuanceOfDebt;
    }

    public Integer getRepaymentOfDebt() {
        return repaymentOfDebt;
    }

    public void setRepaymentOfDebt(Integer repaymentOfDebt) {
        this.repaymentOfDebt = repaymentOfDebt;
    }

    public Integer getRepurchaseOfCapitalStock() {
        return repurchaseOfCapitalStock;
    }

    public void setRepurchaseOfCapitalStock(Integer repurchaseOfCapitalStock) {
        this.repurchaseOfCapitalStock = repurchaseOfCapitalStock;
    }

    public Integer getFreeCashFlow() {
        return freeCashFlow;
    }

    public void setFreeCashFlow(Integer freeCashFlow) {
        this.freeCashFlow = freeCashFlow;
    }
}
