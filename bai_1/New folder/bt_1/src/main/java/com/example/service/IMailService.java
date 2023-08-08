package com.example.service;

import com.example.model.Mail;

import java.util.List;

public interface IMailService {
    List<Mail> find();
    boolean save(Mail mail);

}
