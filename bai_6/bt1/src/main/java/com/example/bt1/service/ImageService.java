package com.example.bt1.service;

import com.example.bt1.model.Image;
import com.example.bt1.repository.IImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class ImageService implements  IImageService{
    @Override
    public Page<Image> search(Pageable String searchName) {
        return iImageRepository.searchByAuthor(searchName);
    }

    @Override
    public Page<Image> show(Pageable pageable) {
        return iImageRepository.findAll(pageable);
    }

    @Autowired
   private IImageRepository iImageRepository;

    @Override
    public List<Image> show() {
        return iImageRepository.findAll();
    }
    @Override
    public boolean save(Image image) {
        Image image1=iImageRepository.save(image);
       if (image1!=null){
           return true;
       }
        return false;
    }
}
