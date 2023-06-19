package com.yessyscreations.yessyscreations.models;

public class Craft {

    private Long id;
    private String craftName;
    private String eventCategory;
    private String craftSize;
    private String craftImage;


    public Craft(){
    }
    public Craft(Long id, String craftName, String eventCategory, String craftSize, String craftImage){
        this.id = id;
        this.craftName = craftName;
        this.eventCategory = eventCategory;
        this.craftSize = craftSize;
        this.craftImage = craftImage;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCraftName() {
        return craftName;
    }

    public void setCraftName(String craftName) {
        this.craftName = craftName;
    }

    public String getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(String eventCategory) {
        this.eventCategory = eventCategory;
    }

    public String getCraftSize() {
        return craftSize;
    }

    public void setCraftSize(String craftSize) {
        this.craftSize = craftSize;
    }

    public String getCraftImage() {
        return craftImage;
    }
    public void setCraftImage(String craftImage) {
        this.craftImage = craftImage;
    }
}


