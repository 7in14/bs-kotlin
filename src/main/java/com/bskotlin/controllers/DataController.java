package com.bskotlin.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bskotlin.services.Data;

@RestController
public class DataController {

    @RequestMapping("/allData")
    public List<Data> getAll(){
        var result = new ArrayList<Data>();
        result.add(new Data("test title 1", "test details 1"));
        result.add(new Data("test title 2", "test details 2"));
        return result;
    }
}
