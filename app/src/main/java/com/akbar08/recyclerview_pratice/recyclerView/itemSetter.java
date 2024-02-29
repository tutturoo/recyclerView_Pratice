package com.akbar08.recyclerview_pratice.recyclerView;

public class itemSetter {
    String newsTitleHeader;
    String newsPublisherName;
    int newsThumbnail;

    public itemSetter(String newsTitleHeader, String newsPublisherName, int newsThumbnail) {
        this.newsTitleHeader = newsTitleHeader;
        this.newsPublisherName = newsPublisherName;
        this.newsThumbnail = newsThumbnail;
    }

    public String getNewsTitleHeader() {
        return newsTitleHeader;
    }

    public void setNewsTitleHeader(String newsTitleHeader) {
        this.newsTitleHeader = newsTitleHeader;
    }

    public String getNewsPublisherName() {
        return newsPublisherName;
    }

    public void setNewsPublisherName(String newsPublisherName) {
        this.newsPublisherName = newsPublisherName;
    }

    public int getNewsThumbnail() {
        return newsThumbnail;
    }

    public void setNewsThumbnail(int newsThumbnail) {
        this.newsThumbnail = newsThumbnail;
    }
}
