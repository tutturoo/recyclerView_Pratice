package com.akbar08.recyclerview_pratice.recyclerView;

public class itemSetter {
    String newsTitleHeader;
    String imgUrl;
    String newsPublisherName;


    public itemSetter(String newsTitleHeader, String newsPublisherName, String imgUrl) {
        this.newsTitleHeader = newsTitleHeader;
        this.newsPublisherName = newsPublisherName;
        this.imgUrl = imgUrl;
    }
    public String getImgUrl() {
        return imgUrl;
    }
    public String getNewsTitleHeader() {
        return newsTitleHeader;
    }
    public String getNewsPublisherName() {
        return newsPublisherName;
    }
}
