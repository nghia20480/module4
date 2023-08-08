package com.example.update_photo3.service;

import com.example.update_photo3.entity.Picture;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IPictureService {
    List <Picture> findAll();
    Page<Picture> findAllToday(String date, Pageable pageable);
    Picture findById(int id);
    boolean addPicture(Picture picture);
    boolean addLike (Picture picture);
    void create(Picture picture);
}
