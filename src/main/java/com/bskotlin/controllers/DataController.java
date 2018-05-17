package com.bskotlin.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.bskotlin.services.Data;
import com.bskotlin.services.DataService;
import com.bskotlin.services.DataSource;

@Controller
@RestController
public class DataController {

    @Autowired
    private DataService dataService;

    @RequestMapping("/allData")
    public List<Data> getAll(){
        return this.dataService.getAllData();
    }

    @RequestMapping(value = "/data", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<String> insert(@RequestBody DataSource ds) {
        this.dataService.insert(ds);
    	return new ResponseEntity<>("Saved", HttpStatus.OK);
    }

    @RequestMapping("/test")
    public String test() {
        return "DataController is up and running";
    }
}
