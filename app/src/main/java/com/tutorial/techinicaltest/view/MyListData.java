package com.tutorial.techinicaltest.view;

public class MyListData{
    private String description;
    private String name;
    private String imageUrl;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public MyListData(String description, String name, String imageUrl) {
        this.description = description;  
        this.name = name;
        this.imageUrl = imageUrl;
    }  
    /*public String getDescription() {
        return description;  
    }  
    public void setDescription(String description) {  
        this.description = description;  
    }  
    public int getImgId() {  
        return imgId;  
    }  
    public void setImgId(int imgId) {  
        this.imgId = imgId;  
    }  */
}  