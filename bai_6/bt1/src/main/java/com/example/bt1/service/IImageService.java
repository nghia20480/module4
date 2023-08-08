package com.example.bt1.service;

import com.example.bt1.model.Image;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IImageService {
    List<Image> show();
    Page<Image> show(Pageable pageable);
    boolean save(Image image);
    Page<Image> search(Pageable pageable, String searchName);
}
