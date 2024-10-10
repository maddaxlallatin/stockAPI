package com.maddaxlallatin.stockapi.model.Analyst;

public class SingleAnalystRecommendation {
    private String analyst;
    private String overallScore;
    private String directionScore;
    private String priceScore;
    private String rating;
    private String priceTarget;
    private String date;

    public SingleAnalystRecommendation(String analyst, String overallScore, String directionScore, String priceScore, String rating, String priceTarget, String date) {
        this.analyst = analyst;
        this.overallScore = overallScore;
        this.directionScore = directionScore;
        this.priceScore = priceScore;
        this.rating = rating;
        this.priceTarget = priceTarget;
        this.date = date;
    }

    public String getAnalyst() {
        return analyst;
    }

    public String getOverallScore() {
        return overallScore;
    }

    public String getDirectionScore() {
        return directionScore;
    }

    public String getPriceScore() {
        return priceScore;
    }

    public String getRating() {
        return rating;
    }

    public String getPriceTarget() {
        return priceTarget;
    }

    public String getDate() {
        return date;
    }

    public void setAnalyst(String analyst) {
        this.analyst = analyst;
    }

    public void setOverallScore(String overallScore) {
        this.overallScore = overallScore;
    }

    public void setDirectionScore(String directionScore) {
        this.directionScore = directionScore;
    }

    public void setPriceScore(String priceScore) {
        this.priceScore = priceScore;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public void setPriceTarget(String priceTarget) {
        this.priceTarget = priceTarget;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
