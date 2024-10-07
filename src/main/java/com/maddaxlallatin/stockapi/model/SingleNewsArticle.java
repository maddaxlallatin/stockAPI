package com.maddaxlallatin.stockapi.model;

public class SingleNewsArticle {
    private String title;
    private String description;
    private String link;

    public SingleNewsArticle(String title, String description, String link) {
        this.title = title;
        this.description = description;
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public String getLink() {
        return link;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
