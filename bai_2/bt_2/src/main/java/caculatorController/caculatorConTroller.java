package caculatorController;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/caculator")
public class caculatorConTroller {
    @GetMapping("")
    public String displayCaculator(){
        return "caculator";
    }

    @GetMapping("/result")
    public String calculate(String active,double first, double second, Model model){
        double result = 0;
        switch (active){
            case "Addition(+)":
                result = first + second;
                break;
            case "Subtraction(-)":
                result = first - second;
                break;
            case "Multiplication(x)":
                result = first * second;
                break;
            case "Division(/)":
                result = first/second;
                break;
        }
        model.addAttribute("result",result);
        model.addAttribute("active", active);
        model.addAttribute("first", first);
        model.addAttribute("second", second);
        return "caculatorResult";
    }

}
