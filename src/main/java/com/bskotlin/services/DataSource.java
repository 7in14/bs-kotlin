package com.bskotlin.services;

import org.springframework.data.annotation.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class DataSource {

    @Id
    @JsonProperty
    private String id;
    
    @JsonProperty(required=true, value="url")
    private String url;

    public DataSource(@JsonProperty("url") String url) {
        this.setUrl(url);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
