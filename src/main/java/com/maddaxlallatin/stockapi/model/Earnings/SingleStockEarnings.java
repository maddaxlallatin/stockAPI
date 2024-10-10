package com.maddaxlallatin.stockapi.model.Earnings;

public class SingleStockEarnings {
    public String earningsDate;
    public String epsEstimate;
    public String reportedEPS;
    public String surprisePercent;

    public SingleStockEarnings(String earningsDate, String epsEstimate, String reportedEPS, String surprisePercent) {
        this.earningsDate = earningsDate;
        this.epsEstimate = epsEstimate;
        this.reportedEPS = reportedEPS;
        this.surprisePercent = surprisePercent;
    }

    public String getEarningsDate() {
        return earningsDate;
    }

    public void setEarningsDate(String earningsDate) {
        this.earningsDate = earningsDate;
    }

    public String getEpsEstimate() {
        return epsEstimate;
    }

    public void setEpsEstimate(String epsEstimate) {
        this.epsEstimate = epsEstimate;
    }

    public String getReportedEPS() {
        return reportedEPS;
    }

    public void setReportedEPS(String reportedEPS) {
        this.reportedEPS = reportedEPS;
    }

    public String getSurprisePercent() {
        return surprisePercent;
    }

    public void setSurprisePercent(String surprisePercent) {
        this.surprisePercent = surprisePercent;
    }
}
