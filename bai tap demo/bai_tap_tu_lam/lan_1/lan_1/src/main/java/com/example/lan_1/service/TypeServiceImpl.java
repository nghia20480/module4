package com.example.lan_1.service;

import com.example.lan_1.entity.Type;
import com.example.lan_1.repo.ProductRepo;
import com.example.lan_1.repo.TypeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService{
    @Autowired
    ProductRepo productRepo;
    @Autowired
    TypeRepo typeRepo;
    @Override
    public List<Type> findAll() {
        return typeRepo.findAll();
    }

    @Override
    public Type findById(Integer id) {
        return null;
    }
}
