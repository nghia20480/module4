package com.example.update_photo3.service;

import com.example.update_photo3.entity.Picture;
import com.example.update_photo3.repository.IPictureReposirory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PictureServiceImpl implements IPictureService{
    @Autowired
    IPictureReposirory reposirory;

    @Override
    public void create(Picture picture) {
        picture.setDate();
        reposirory.save(picture);
    }
    @Override
    public List<Picture> findAll() {
        return reposirory.findAll();
    }

    @Override
    public Page<Picture> findAllToday(String date, Pageable pageable) {
        return reposirory.findAllToday(date,pageable);
    }

    @Override
    public Picture findById(int id) {
        return reposirory.findById(id).orElse(null);
    }

    @Override
    public boolean addPicture(Picture picture) {
         picture.setDate();
         reposirory.save(picture);
         return true;
    }

    @Override
    public boolean addLike(Picture picture) {
        picture.setLikes(picture.getLikes()+1);
        reposirory.save(picture);
        return true;
    }
}
