package com.flowerfly.site.domainbean;

public final class Review {
    private final String userId;
    private final float score;
    private final String comment;
    
    public Review(String userId, float score, String comment) {
	super();
	this.userId = userId;
	this.score = score;
	this.comment = comment;
    }

    public String getUserId() {
        return userId;
    }

    public float getScore() {
        return score;
    }

    public String getComment() {
        return comment;
    }
    
    
    
    
    

}
