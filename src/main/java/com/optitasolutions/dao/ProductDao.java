package com.optitasolutions.dao;

import com.optitasolutions.POJO.Product;
import com.optitasolutions.wrapper.ProductWrapper;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductDao extends JpaRepository<Product, Integer> {

    List<ProductWrapper> getAllProduct();
}
