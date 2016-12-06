package com.flowerfly.site.controllers;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.flowerfly.site.App;
import com.flowerfly.site.domainbean.pojo.ProductPOJO;
import com.flowerfly.site.generator.ProductGenerator;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = App.class)
@ComponentScan("com.flowerfly.site")
@AutoConfigureMockMvc
public class TestProductController {
    
    @Autowired
    private MockMvc mvc;
    
    private static ObjectMapper mapper;
    
    @BeforeClass
    public static void setup(){
	mapper = new ObjectMapper();
    }
    

    @Test
    public void createProduct() throws Exception{
//	ProductPOJO product = ProductGenerator.generate();
//	String productJSON = mapper.writeValueAsString(product);
//	
//	mvc.perform(MockMvcRequestBuilders.post("/products").contentType(MediaType.APPLICATION_JSON).content(productJSON))
//		.andExpect(status().isOk());
//		//.andExpect(jsonPath("$.id").value(product.getId()));
    }
    
}
