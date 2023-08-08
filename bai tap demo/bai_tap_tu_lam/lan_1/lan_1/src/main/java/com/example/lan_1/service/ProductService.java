package com.example.lan_1.service;

import com.example.lan_1.entity.Product;
import com.example.lan_1.entity.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProductService {
Page<Product> findAll(Pageable pageable);
void  create(Product product);
void delete(Integer id);

}
