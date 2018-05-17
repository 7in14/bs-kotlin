package com.bskotlin.services;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataSource {
    
    @JsonProperty(required=true, value="url")
    private String url;

    public DataSource(@JsonProperty("url") String url) {
        this.setUrl(url);
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
