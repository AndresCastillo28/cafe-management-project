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

    @DeleteMapping(path = "/{id}")
    ResponseEntity<String> deleteProduct(@PathVariable Integer id);

    @PatchMapping
    ResponseEntity<String> updateStatus(@RequestBody Map<String, String> requestMap);

    @GetMapping("/find-by-category/{id}")
    ResponseEntity<List<ProductWrapper>> getByCategory(@PathVariable Integer id);

    @GetMapping("/{id}")
    ResponseEntity<ProductWrapper> getProductById(@PathVariable Integer id);
}
