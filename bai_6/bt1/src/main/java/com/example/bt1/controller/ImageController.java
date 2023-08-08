package com.example.bt1.controller;

import com.example.bt1.model.Image;
import com.example.bt1.service.IImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/image")
public class ImageController {
    @Autowired
    IImageService iImageService;
    /*@GetMapping("")
    public String ShowImage(){
        return "show";
    }*/
    /*@GetMapping("/show")
    public String showFormCreate(Model model){
        model.addAttribute("image",new Image());
        return "show";
    }*/
    @GetMapping("")
    public ModelAndView  showList(
            @RequestParam(defaultValue = "0")int page,
            @RequestParam(defaultValue = "2") int size

    ){
        Pageable pageable= PageRequest.of(page, size);
        Page<Image> images=iImageService.show(pageable);
        ModelAndView modelAndView= new ModelAndView("show");
        modelAndView.addObject("images",images);
        modelAndView.addObject("image",new Image());
        Page<Image> imageSearch=iImageService.search(searchName);
        modelAndView.addObject("imageSearch",imageSearch);
        return modelAndView;
    }

    @GetMapping("/save")
    public String save(@ModelAttribute Image image, Model model, RedirectAttributes redirectAttributes){
        iImageService.save(image);
        return "redirect:/image";
    }
    @GetMapping("/search")
    public ModelAndView search(@RequestParam String searchName){
        List<Image> imageSearch=iImageService.search(searchName);
        modelAndView.addObject("imageSearch",imageSearch);
        return modelAndView;
    }
}
