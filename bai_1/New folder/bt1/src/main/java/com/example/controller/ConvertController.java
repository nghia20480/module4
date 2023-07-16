package com.example.controller;


import com.example.repository.IConvertRepository;
import com.example.service.IConvertService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
@Autowired
private IConvertService convertService;
    @GetMapping("/")
    public String Home(){
        return "/convert";
    }
    @GetMapping("/convert1")
    public String Calculate(@RequestParam double VND,
    Model model){
       double USD= convertService.Convert(VND);
        model.addAttribute("USD",USD);
        return "/convert";
    }
}
