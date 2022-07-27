package repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import model.Marvel;

public interface MarvelRepo extends MongoRepository <Marvel, Integer>{

}
