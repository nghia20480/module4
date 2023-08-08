package com.example.update_photo3.repository;//package com.example.update_photo2.repository;//package com.example.update_photo1.repository;
//
//import com.example.update_photo1.entity.Picture;
//import org.springframework.stereotype.Repository;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//import javax.transaction.Transactional;
//import java.util.List;
//
//
//@Repository
//@Transactional
//public class PictureReposiroryImpl implements IPictureReposirory{
//
//    @PersistenceContext
//    private EntityManager entityManager;
//    @Override
//    public List<Picture> findAll() {
//        return entityManager.createQuery("select p from Picture p ").getResultList();
//    }
//
//    @Override
//    public List<Picture> findAllToday(String date) {
//        return  entityManager.createQuery("select p from Picture p where p.date=?1").setParameter(1,date).getResultList();
//    }
//
//    @Override
//    public Picture findById(int id) {
//        return entityManager.find(Picture.class,id);
//    }
//
//    @Override
//    public boolean addPicture(Picture picture) {
//        picture.setDate();
//        entityManager.persist(picture);
//        return true;
//    }
//
//    @Override
//    public boolean addLike(Picture picture) {
//        picture.setLikes(picture.getLikes()+1);
//        entityManager.merge(picture);
//        return false;
//    }
//}
