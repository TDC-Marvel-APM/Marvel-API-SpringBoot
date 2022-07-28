package com.example.marvel.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.marvel.model.Marvel;

public interface MarvelRepo extends MongoRepository <Marvel, String>{

}
