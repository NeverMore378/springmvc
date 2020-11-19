package pers.xzj.springmvc.controller;


import javafx.geometry.VPos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class Controller6 {

    @ModelAttribute
    public void modelandView(Model model){
        model.addAttribute("test",123);
    }


    @GetMapping("/index")
    public String test(){
        return "index.jsp";
    }

}
