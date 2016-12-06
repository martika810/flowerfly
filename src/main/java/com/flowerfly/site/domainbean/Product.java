package com.flowerfly.site.domainbean;

import java.util.List;

public final class Product {

    private final String id;
    private final String name;
    private final String description;
    private final List<String> imageUrls;
    private final List<SourceURL> buyUrls;
    private final List<SourceURL> howToUseUrls;
    private final List<Review> reviews;

    private Product(Builder builder) {
	this.id = builder.id;
	this.name = builder.name;
	this.description = builder.description;
	this.imageUrls = builder.imageUrls;
	this.buyUrls = builder.buyUrls;
	this.howToUseUrls = builder.howToUseUrls;
	this.reviews = builder.reviews;
    }

    private class Builder {
	private String id;
	private String name;
	private String description;
	private List<String> imageUrls;
	private List<SourceURL> buyUrls;
	private List<SourceURL> howToUseUrls;
	private List<Review> reviews;
	
	public Builder(String id,String name){
	    this.id = id;
	    this.name = name;
	}
	
	public Builder description(String description){
	    this.description = description;
	    return this;
	}
	public Builder imageUrls(List<String> imageUrls){
	    this.imageUrls = imageUrls;
	    return this;
	}
	public Builder buyUrls(List<SourceURL> buyUrls){
	    this.buyUrls =  buyUrls;
	    return this;
	}
	public Builder howToUseUrls(List<SourceURL> howToUseUrls){
	    this.howToUseUrls = howToUseUrls;
	    return this;
	}
	
	public Builder reviews(List<Review> reviews){
	    this.reviews = reviews;
	    return this;
	}
	
	public Product build(){
	    return new Product(this);
	}
    }
}
