package com.flowerfly.site.domainbean.pojo;

import java.util.List;

import com.flowerfly.site.domainbean.Review;
import com.flowerfly.site.domainbean.SourceURL;

public class ProductPOJO {
    
    private String id;
    private String name;
    private String description;
    private List<String> imageUrls;
    private List<SourceURLPOJO> buyUrls;
    private List<SourceURLPOJO> howToUseUrls;
    private List<ReviewPOJO> reviews;
    
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<String> getImageUrls() {
        return imageUrls;
    }
    public void setImageUrls(List<String> imageUrls) {
        this.imageUrls = imageUrls;
    }
    public List<SourceURLPOJO> getBuyUrls() {
        return buyUrls;
    }
    public void setBuyUrls(List<SourceURLPOJO> buyUrls) {
        this.buyUrls = buyUrls;
    }
    public List<SourceURLPOJO> getHowToUseUrls() {
        return howToUseUrls;
    }
    public void setHowToUseUrls(List<SourceURLPOJO> howToUseUrls) {
        this.howToUseUrls = howToUseUrls;
    }
    public List<ReviewPOJO> getReviews() {
        return reviews;
    }
    public void setReviews(List<ReviewPOJO> reviews) {
        this.reviews = reviews;
    }
    
    

}
