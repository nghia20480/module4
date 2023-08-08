package com.example.service;

import com.example.model.Mail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class MailService implements IMailService{
    @Autowired
    IMailService mailService;
    @Override
    public List<Mail> find() {
        return mailService.find();
    }

    @Override
    public boolean save(Mail mail) {
        return mailService.save(mail);
    }
}
