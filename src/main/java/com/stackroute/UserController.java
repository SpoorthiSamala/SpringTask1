package com.stackroute;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class UserController {

    @RequestMapping("/")
    public  String display(Model model){
        User user=new User();
        user.setName("Spoorthi");
        String name=user.getName();
        model.addAttribute("msg",name);
        return "index";
    }

}
