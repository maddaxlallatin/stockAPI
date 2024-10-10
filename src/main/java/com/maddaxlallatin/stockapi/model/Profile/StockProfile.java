package com.maddaxlallatin.stockapi.model.Profile;

public class StockProfile {
    private String ticker;
    private String company;
    private String sector;
    private String industry;
    private String ceo;
    private String employees;

    public StockProfile(String ticker, String company, String sector, String industry, String ceo, String employees) {
        this.ticker = ticker;
        this.company = company;
        this.sector = sector;
        this.industry = industry;
        this.ceo = ceo;
        this.employees = employees;
    }

    public String getTicker() {
        return ticker;
    }

    public String getCompany() {
        return company;
    }

    public String getSector() {
        return sector;
    }

    public String getIndustry() {
        return industry;
    }

    public String getCeo() {
        return ceo;
    }

    public String getEmployees() {
        return employees;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setSector(String sector) {
        this.sector = sector;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public void setCeo(String ceo) {
        this.ceo = ceo;
    }

    public void setEmployees(String employees) {
        this.employees = employees;
    }
}
