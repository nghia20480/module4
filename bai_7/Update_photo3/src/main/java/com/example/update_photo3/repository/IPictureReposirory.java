package com.example.update_photo3.repository;

import com.example.update_photo3.entity.Picture;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IPictureReposirory extends JpaRepository<Picture,Integer> {
    @Query(value = "select p from Picture p  where p.date = :date")
    Page<Picture> findAllToday(@Param("date") String date, Pageable pageable);
}
