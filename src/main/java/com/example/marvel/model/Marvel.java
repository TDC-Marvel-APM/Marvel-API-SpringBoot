package com.example.marvel.model;
// Java Program to illustrate Book File
  
// Importing required classes
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
  
// Annotations
@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Marvel")
  
// Class
public class Marvel {
  
    // Attributes
    private String id;
    private String name;
    private String authorName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}