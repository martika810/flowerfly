package com.flowerfly.site.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flowerfly.site.domainbean.pojo.ProductPOJO;

@RestController
@RequestMapping("/products")
public class ProductController {
    
    @RequestMapping(method = RequestMethod.POST , consumes = "application/json")
    public ResponseEntity<ProductPOJO> createProduct(@RequestBody ProductPOJO product){
	return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    
    @RequestMapping(value="/{productId}" , method = RequestMethod.GET)
    public ResponseEntity<ProductPOJO> read(@PathVariable String id){
	return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<ProductPOJO> update(@RequestBody ProductPOJO product){
	return ResponseEntity.status(HttpStatus.OK).body(null);
    }
    
    


}
