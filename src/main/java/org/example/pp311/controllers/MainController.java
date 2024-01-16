package org.example.pp311.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping({"/", "/index"} )
    public String startPage(){
        return "redirect:/users/index";
    }
}
