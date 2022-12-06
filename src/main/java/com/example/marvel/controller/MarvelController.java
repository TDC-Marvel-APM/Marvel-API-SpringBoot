package com.example.marvel.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.marvel.model.Marvel;
import com.example.marvel.repository.MarvelRepo;

@RestController
public class MarvelController {
	
	@Autowired
    private MarvelRepo repo;
  
    @PostMapping("/add")
    public String saveMoviesAndSeries(@RequestBody Marvel marvel){
        repo.save(marvel);
        
        return "Added Successfully";
    }
  
    @GetMapping("/findAll")
    public List<Marvel> getMoviesAndSeries() {
        
        return repo.findAll();
    }
    
    @CrossOrigin(origins = "http://localhost:3000")
    @PutMapping("/update/{id}")
    public ResponseEntity<Marvel> update(@PathVariable("id") String id, @RequestBody Marvel marvel) {
      Optional<Marvel> tutorialData = repo.findById(id);
      if (tutorialData.isPresent()) {
    	Marvel _tutorial = tutorialData.get();
        _tutorial.setName(marvel.getName());
        _tutorial.setHero(marvel.getHero());
        _tutorial.setYear(marvel.getYear());
        _tutorial.setStar(marvel.getStar());
        _tutorial.setImage(marvel.getImage());
        return new ResponseEntity<>(repo.save(_tutorial), HttpStatus.OK);
      } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
    }
  
    @CrossOrigin(origins = "http://localhost:3000")
    @DeleteMapping("/delete/{id}")
    public String deleteMoviesAndSeries(@PathVariable String id){
        repo.deleteById(id);
        
        return "Deleted Successfully";
    }
}
