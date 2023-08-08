package com.example.repository;

import com.example.model.Mail;

import java.util.List;

public interface IMailRepository {
    List<Mail> find();
    boolean save(Mail mail);

}
