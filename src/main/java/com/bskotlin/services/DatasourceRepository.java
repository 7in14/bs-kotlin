package com.bskotlin.services;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "dataSource", path = "dataSource")
public interface DatasourceRepository extends MongoRepository<DataSource, String> {

    Optional<DataSource> findById(@Param("id") String id);

}