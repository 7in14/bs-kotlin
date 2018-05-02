package com.bskotlin.controllers;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bskotlin.repository.interfaces.DataRepository;
import com.bskotlin.services.Data;
import com.bskotlin.services.DataSource;
import com.bskotlin.services.DatasourceService;

@Controller
@RestController
public class DataController {

    @Autowired
    private DataRepository service;

//    public DataController() {
//        //this.service = new DatasourceService();//TODO: decouple this, some dependency injection in spring?
//    }

    @RequestMapping("/allData")
    public List<Data> getAll(){
        return this.service.findAll().stream().map(x-> new Data("",x.getUrl())).collect(Collectors.toList());
    }

    @RequestMapping(value = "/data", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity insert(@RequestBody DataSource ds) {
        this.service.save(ds);
        return new ResponseEntity<>("Saved", HttpStatus.OK);
    }

    @RequestMapping("/test")
    public String test() {
        return "DataController is up and running";
    }

}
