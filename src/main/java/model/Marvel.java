package model;
// Java Program to illustrate Book File
  
// Importing required classes
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
  
// Annotations
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Marvel")
  
// Class
public class Marvel {
  
    // Attributes
    @Id private int id;
    private String name;
    private String authorName;
}