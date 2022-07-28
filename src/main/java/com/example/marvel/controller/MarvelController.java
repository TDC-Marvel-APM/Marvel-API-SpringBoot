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
    public String saveBook(@RequestBody Marvel marvel){
        repo.save(marvel);
        
        return "Added Successfully";
    }
  
    @GetMapping("/findAll")
    public List<Marvel> getBooks() {
        
        return repo.findAll();
    }
    
    @PutMapping("/update/{id}")
    public ResponseEntity<Marvel> update(@PathVariable("id") String id, @RequestBody Marvel marvel) {
      Optional<Marvel> tutorialData = repo.findById(id);
      if (tutorialData.isPresent()) {
    	Marvel _tutorial = tutorialData.get();
        _tutorial.setName(marvel.getName());
        _tutorial.setAuthorName(marvel.getAuthorName());
        return new ResponseEntity<>(repo.save(_tutorial), HttpStatus.OK);
      } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
      }
    }
  
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable String id){
        repo.deleteById(id);
        
        return "Deleted Successfully";
    }
}
