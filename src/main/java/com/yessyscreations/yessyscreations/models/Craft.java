package com.yessyscreations.yessyscreations.models;

import jakarta.persistence.*;

@Entity
@Table(name = "craft")
public class Craft {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "craft_name", nullable = false)
    private String craftName;
    @Column(name = "event_category", nullable = false)
    private String eventCategory;
    @Column(name = "craft_size", nullable = false)
    private String craftSize;
    @Column(name = "craft_image", nullable = false)
    private String craftImage;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;


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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}


