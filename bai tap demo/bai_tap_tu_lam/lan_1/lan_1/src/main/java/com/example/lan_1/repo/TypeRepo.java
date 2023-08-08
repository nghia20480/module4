package com.example.lan_1.repo;

import com.example.lan_1.entity.Product;
import com.example.lan_1.entity.Type;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TypeRepo extends JpaRepository<Type,Integer> {
}
