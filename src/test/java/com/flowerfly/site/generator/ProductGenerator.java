package com.flowerfly.site.generator;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import com.flowerfly.site.domainbean.SourceURL;
import com.flowerfly.site.domainbean.pojo.ProductPOJO;
import com.flowerfly.site.domainbean.pojo.ReviewPOJO;
import com.flowerfly.site.domainbean.pojo.SourceURLPOJO;

public class ProductGenerator {
    
    private final static Random random = new Random();
    
    public static ProductPOJO generate(){
	int num = random.nextInt();
	ProductPOJO product = new ProductPOJO();
	product.setId(UUID.randomUUID().toString());
	product.setName("product"+num);
	product.setDescription("description"+num);
	product.setImageUrls(generateUrlList());
	product.setBuyUrls(generateSourceURLList());
	product.setHowToUseUrls(generateSourceURLList());
	product.setReviews(generateReviewList());
	return product;
    }
    
    public static List<String> generateUrlList(){
	List<String> imageUrls = new LinkedList<String>();
	int size = random.nextInt(10);
	for(int i=0;i<size;i++){
	    String randomURL = "ramdomURL"+random.nextInt();
	    imageUrls.add(randomURL);
	}
	return imageUrls;
    }
    
    public static List<SourceURLPOJO> generateSourceURLList(){
	List<SourceURLPOJO> list = new LinkedList<SourceURLPOJO>();
	int size = random.nextInt(10);
	for(int i=0;i<size;i++){
	    list.add(generateSourceURL());
	}
	return list;
    }
    
    public static List<ReviewPOJO> generateReviewList(){
	List<ReviewPOJO> list = new LinkedList<ReviewPOJO>();
	int size = random.nextInt(10);
	for(int i=0;i<size;i++){
	    list.add(generateReview());
	}
	return list;
    }
    
    public static SourceURLPOJO generateSourceURL(){
	SourceURLPOJO sourceURL = new SourceURLPOJO();
	int num = random.nextInt();
	sourceURL.setSourceSite("site"+num);
	sourceURL.setUrl("url"+num);
	return sourceURL;
    }
    
    public static ReviewPOJO generateReview(){
	ReviewPOJO review = new ReviewPOJO();
	int num = random.nextInt();
	review.setUserId("userid"+num);
	review.setScore(Float.valueOf(num));
	review.setComment("comment"+num);
	return review;
    }

}
