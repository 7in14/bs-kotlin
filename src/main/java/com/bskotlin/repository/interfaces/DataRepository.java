package com.bskotlin.repository.interfaces;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bskotlin.services.DataSource;

public interface DataRepository extends MongoRepository<DataSource, Long>{
}
