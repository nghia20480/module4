package com.example.lan_1.service;

import com.example.lan_1.entity.Type;

import java.util.List;

public interface TypeService {
    List<Type> findAll();
    Type findById(Integer id);
}
