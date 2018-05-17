package com.bskotlin.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@Configuration
public class MongoConfiguration extends AbstractMongoConfiguration {
  
    @Override
    protected String getDatabaseName() {
        return "test";
    }
  
	@Override
	public MongoClient mongoClient() {
		return new MongoClient(new MongoClientURI("TODO"
				));
	}
  
    @Override
    protected String getMappingBasePackage() {
        return "com.bskotlin";
    }
}