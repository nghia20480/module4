package sandwichController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/sandwich")
public class SandwichController {
    @GetMapping("/menu")
    public String sandwichCheckbox(){
        return "sandwich";
    }
    @GetMapping("/save")
    public ModelAndView save(@RequestParam("condiment") String[] condiment){
        ModelAndView modelAndView = new ModelAndView("saveSandwich");
        modelAndView.addObject(condiment);
        return modelAndView;
    }
}
