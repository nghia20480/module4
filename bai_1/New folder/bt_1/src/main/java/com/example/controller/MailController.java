package com.example.controller;

import com.example.model.Mail;
import com.example.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/student")
public class MailController {
    @Autowired
    IMailService iMailService;
    @GetMapping("")
    public String Model(@RequestParam Model model){
        List<Mail> mail=iMailService.find();
      Mail mail1=mail.get(0);
        model.addAttribute("mail",mail1);
        return "show";
    }
    @GetMapping("/save")
    public String Save(@RequestParam  Mail mail,Model model ){
    iMailService.save(mail);
        return "show";
    }



}
