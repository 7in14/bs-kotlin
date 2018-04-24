package com.bskotlin.services;

import org.springframework.data.annotation.Id;

public class DataSource {

    @Id private String id;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String value) {
        this.url = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
