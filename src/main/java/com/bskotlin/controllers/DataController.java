package com.bskotlin.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bskotlin.services.Data;
import com.bskotlin.services.DataSource;
import com.bskotlin.services.DatasourceService;

@Controller
@RestController
public class DataController {

    private DatasourceService service;

    public DataController() {
        this.service = new DatasourceService();//TODO: decouple this, some dependency injection in spring?
    }

    @RequestMapping("/allData")
    public List<Data> getAll(){
        //var result = new ArrayList<Data>();
        //result.add(new Data("test title 1", "test details 1"));
        //result.add(new Data("test title 2", "test details 2"));
        //return result;
        //return this.service.getAll().stream().map(d -> getDataFromUrl());
        return this.service.getAllData();
    }

    @RequestMapping(value = "/data", method = RequestMethod.POST)
    public void insert(DataSource ds) {
        this.service.insert(ds);
    }

    @RequestMapping("/test")
    public String test() {
        return "DataController is up and running";
    }

}
