package com.example.lan_1.service;

import com.example.lan_1.entity.Product;
import com.example.lan_1.entity.Type;
import com.example.lan_1.repo.ProductRepo;
import com.example.lan_1.repo.TypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
     ProductRepo productRepo;
    @Autowired
    TypeRepo typeRepo;
    @Override
    public Page<Product> findAll(Pageable pageable) {
        return productRepo.findAll(pageable);
    }

    @Override
    public void create(Product product) {
       productRepo.save(product);
    }

    @Override
    public void delete(Integer id) {
        productRepo.deleteById(id);
    }
}
