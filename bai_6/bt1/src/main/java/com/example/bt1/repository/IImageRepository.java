package com.example.bt1.repository;

import com.example.bt1.model.Image;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IImageRepository extends JpaRepository<Image,Integer> {
    @Override
    List<Image> findAll();
    Page<Image> searchByAuthor(String name);
}
