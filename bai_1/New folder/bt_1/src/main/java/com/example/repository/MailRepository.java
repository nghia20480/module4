package com.example.repository;

import com.example.model.Mail;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class MailRepository implements IMailRepository{
    private  static List<Mail> mailList = new ArrayList<>();
    static {
        mailList.add(new Mail("English", 15, true, "Nghia"));
    }
    @Override
    public List<Mail> find() {
        return mailList;
    }

    @Override
    public boolean save(Mail mail) {
    mailList.remove(0);
        return mailList.add(mail);
    }
}
