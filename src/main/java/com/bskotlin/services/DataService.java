package com.bskotlin.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bskotlin.repository.interfaces.DataRepository;

@Component("dataService")
public class DataService {

    @Autowired
    private DataRepository repository;
    
    public DataService(DataRepository dataRepository) {
    	this.repository = dataRepository;
    }

    public void insert(DataSource dataSource) {
        repository.insert(dataSource);
    }

    public List<DataSource> getAll(){
        return repository.findAll();
    }

    public DataSource get(long id) {
        return repository.findById(id).get();
    }

    public Data getData(long id) {
        return getData(repository.findById(id).get());
    }

    public List<Data> getAllData(){
        return repository
            .findAll()
            .stream()
            .map(ds -> getData(ds))
            .collect(Collectors.toList());
    }

    private Data getData(DataSource ds) {

        String body = ds.getUrl();
        String title = "real body will be data returned from url, todo..";
        Data result = new Data(title, body);
        
        return result;
    }
}
