package product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import product.model.Product;
import product.service.BranchService;
import product.service.ProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @Autowired
    BranchService branchService;
    @GetMapping("/list")
    public String showList(Model model){
        model.addAttribute("products", productService.findAll());
        return "product/list";
    }
    @GetMapping("/create")
    public String showCreatePage(Model model){
        model.addAttribute("newProduct", new Product());
        model.addAttribute("branches", branchService.findAll());
        return "product/create";
    }
    @PostMapping("/create")
    public String createProduct(@ModelAttribute("newProduct")Product product){
        product.setBranch(branchService.findById(product.getBranch().getBranchID()));
        productService.create(product);
        return "redirect:/product/list";
    }
    @GetMapping("/update")
    public String showUpdatePage(@RequestParam("id") int id, Model model){
        model.addAttribute("product", productService.findById(id));
        model.addAttribute("branches", branchService.findAll());
        return "product/update";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute("product") Product product){
        product.setBranch(branchService.findById(product.getBranch().getBranchID()));
        productService.update(product);
        return "redirect:/product/list";
    }
    @GetMapping("/delete")
    public String delete(@RequestParam("id") int id){
        productService.deleteById(id);
        return "redirect:/product/list";
    }
}
