package com.flowerfly.site.domainbean;

public final class SourceURL {
    private final String sourceSite;
    private final String url;
    
    public SourceURL(String sourceSite, String url) {
	super();
	this.sourceSite = sourceSite;
	this.url = url;
    }

    public String getSourceSite() {
        return sourceSite;
    }
    public String getUrl() {
        return url;
    }
   
    
}
