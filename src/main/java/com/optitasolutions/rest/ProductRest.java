package com.optitasolutions.rest;

import com.optitasolutions.wrapper.ProductWrapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping(path = "/product")
public interface ProductRest {

    @PostMapping(path = "/add")
    ResponseEntity<String> addNewProduct(@RequestBody Map<String, String> requestMap);

    @GetMapping
    ResponseEntity<List<ProductWrapper>> getAllProduct();

    @PutMapping
    ResponseEntity<String> updateProduct(@RequestBody Map<String, String> requestMap);
}
