package com.example.lan_1.controller;

import com.example.lan_1.entity.Product;
import com.example.lan_1.entity.Type;
import com.example.lan_1.service.ProductService;
import com.example.lan_1.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class MainController {
    @Autowired
    TypeService typeService;
    @Autowired
    ProductService productService;

    public MainController(TypeService typeService, ProductService productService) {
        this.typeService = typeService;
        this.productService = productService;
    }

    @GetMapping("/")
    public ModelAndView showList(@RequestParam(defaultValue = "0") int page,
                                 @RequestParam(defaultValue = "2") int size) {
        Pageable pageable = PageRequest.of(page, size);
        Page<Product> products = productService.findAll(pageable);
        List<Type> types = typeService.findAll();
        ModelAndView modelAndView=new ModelAndView("view");
        modelAndView.addObject("products", products);
        modelAndView.addObject("types", types);
        return modelAndView;
    }
    @GetMapping("/create")
    public String create(Model model){
        model.addAttribute("types",new Type());
        model.addAttribute("product",new Product());
        return "create";

    }
    @PostMapping("/create")
    public String save(@ModelAttribute Product product, Model model, RedirectAttributes redirectAttributes){
        Product product1=new Product();
        productService.create(product);
        return "redirect:/product";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam ("id") Integer id,
                         RedirectAttributes attributes){
        productService.delete(id);
        return "redirect:/";
    }


}
