package com.bskotlin.repository.interfaces;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bskotlin.services.DataSource;

public interface DataRepository extends MongoRepository<DataSource, Long>{
    //public DataSource get(long id);
    //public List<DataSource> getAll();
}
