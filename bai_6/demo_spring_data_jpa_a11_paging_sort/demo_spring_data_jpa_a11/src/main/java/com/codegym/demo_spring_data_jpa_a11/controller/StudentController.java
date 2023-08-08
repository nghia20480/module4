package com.codegym.demo_spring_data_jpa_a11.controller;

import com.codegym.demo_spring_data_jpa_a11.model.Student;
import com.codegym.demo_spring_data_jpa_a11.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private IStudentService studentService;

//    @GetMapping("/student")
//    public String showList(Model model){
//        List<Student> studentList = studentService.findAll();
//        model.addAttribute("studentList",studentList);
//        return "list";
//    }

//    @GetMapping("")
//    public ModelAndView showList(@PageableDefault(size = 2,page = 0,sort = "name",direction = Sort.Direction.ASC)Pageable pageable,
//                                 @RequestParam(defaultValue = "")String searchName ){
//        Page<Student> studentPage = studentService.findAll(pageable,searchName);
//        ModelAndView modelAndView = new ModelAndView("list");
//        modelAndView.addObject("studentPage",studentPage);
//        modelAndView.addObject("searchName",searchName);
//        return modelAndView ;
//    }

//    @GetMapping("")
//    public ModelAndView showList(@RequestParam(defaultValue = "0") int page,
//                                 @RequestParam(defaultValue = "2") int size,
//                                 @RequestParam(defaultValue = "") String searchName
//    ){
//        Pageable pageable = PageRequest.of(page,size, Sort.by("name").ascending().and(Sort.by("id").ascending()));
//        Page<Student> studentPage = studentService.findAll(pageable,searchName);
//        ModelAndView modelAndView = new ModelAndView("list");
//        modelAndView.addObject("studentPage",studentPage);
//        modelAndView.addObject("searchName",searchName);
//        return modelAndView ;
//    }
    @GetMapping("")
    public ModelAndView showList(@RequestParam(defaultValue = "0") int page,
                                 @RequestParam(defaultValue = "2") int size,
                                 @RequestParam()Optional<String> searchName
                                 ){
        String searchNameValue ="";
        if (searchName.isPresent()){
            searchNameValue = searchName.get();
        }
        Pageable pageable = PageRequest.of(page,size, Sort.by("name").ascending().and(Sort.by("id").ascending()));
        Page<Student> studentPage = studentService.findAll(pageable,searchNameValue);
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("studentPage",studentPage);
        modelAndView.addObject("searchName",searchNameValue);
        return modelAndView ;
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("student",new Student());
        return "create";
    }
    @PostMapping("/create")
    public String save(@ModelAttribute Student student,
                       Model model,
                       RedirectAttributes redirectAttributes){
        studentService.save(student);
        redirectAttributes.addFlashAttribute("mess","them moi thanh cong");
        return "redirect:/student";
    }
    @GetMapping("/detail")
    public String showDetail1(@RequestParam(required = false,defaultValue = "1") int id, Model model){
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        return "detail";
    }
    // pathVariable
//    @GetMapping("/detail/{id}")
    // có thể regex
    @GetMapping("/detail/{id}")
    public String showDetail2(@PathVariable int id, Model model){
        Student student = studentService.findById(id);
        model.addAttribute("student", student);
        return "detail";
    }

    @GetMapping("/search")
    public ModelAndView search(@RequestParam String searchName){
        List<Student> studentList = studentService.search(searchName);
        ModelAndView modelAndView = new ModelAndView("list");
        modelAndView.addObject("studentList",studentList);
        return modelAndView ;
    }
}
