package com.yessyscreations.yessyscreations.models;

public class Crafts {

    private Long id;
    private String craftName;
    private String eventCategory;
    private String craftSize;


    public Crafts(){
    }
    public Crafts(Long id, String craftName, String eventCategory, String craftSize){
        this.id = id;
        this.craftName = craftName;
        this.eventCategory = eventCategory;
        this.craftSize = craftSize;
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
}


