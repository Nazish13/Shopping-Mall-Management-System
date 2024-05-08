package com.shopping;

import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import jakarta.persistence.Column;

@RestController
public class ShoppingMallController 
{
@Autowired
private ShoppingMallService service;
	 
	 // RESTful API methods for Retrieval operations
	 @GetMapping("/shop")
	 public List<ShoppingMallEntity> list() 
	 {
	 return service.listAll();
	 }
	 @Column(name = "id")
	 @GetMapping("shop/{id}")
	 public ResponseEntity<ShoppingMallEntity> get(@PathVariable (name="id") Integer id) 
	 {
	 try
	 {
	 ShoppingMallEntity shop = service.get(id);
	 return new ResponseEntity<ShoppingMallEntity>(shop, HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<ShoppingMallEntity>(HttpStatus.NOT_FOUND);
	 }
}
	// RESTful API method for Create operation
	 @PostMapping("create/shop")
	 public void add(@RequestBody ShoppingMallEntity shop) 
	 {
	 service.save(shop);
	 }
	 
	 // RESTful API method for Update operation
	 @PutMapping("update/shop/{id}")
	 public ResponseEntity<?> update(@RequestBody ShoppingMallEntity shop, @PathVariable (name="id") Integer id) 
	 {
	 try
	 {
     service.save(shop);
	 return new ResponseEntity<>(HttpStatus.OK);
	 } 
	 catch (NoSuchElementException e) 
	 {
	 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	 } 
	 }
	 // RESTful API method for Delete operation
	 @DeleteMapping("delete/shop/{id}")
	 public void deleteById(@PathVariable (name="id") Integer id) 
	 {
	 service.delete(id);
	 }
	}