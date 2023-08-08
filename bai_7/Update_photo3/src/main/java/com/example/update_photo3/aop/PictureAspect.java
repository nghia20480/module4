package com.example.update_photo3.aop;

import com.example.update_photo3.entity.Picture;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.util.logging.Logger;

@Aspect
@Component
public class PictureAspect {
    private Logger logger = Logger.getLogger(PictureAspect.class.getName());

    @AfterThrowing(pointcut = "execution(* com.example.update_photo3.controller.PictureController.doCreate(..))", throwing = "ex")
    public void logException(JoinPoint joinPoint, Exception ex) {
        Picture[] args = new Picture[0];
        Picture picture = args[0];
        String author = picture.getAuthor();
        String feedbackContent = picture.getFeedback();
        LocalDateTime feedbackTime = LocalDateTime.now();
        System.out.println("Exception in Author:" + author +";"+ "Feedback:" + feedbackContent +";"+ "Feedback time:" + feedbackTime);
    }


}