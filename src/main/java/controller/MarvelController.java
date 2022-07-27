package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import model.Marvel;
import repository.MarvelRepo;

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
  
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable int id){
        repo.deleteById(id);
        
        return "Deleted Successfully";
    }
}
