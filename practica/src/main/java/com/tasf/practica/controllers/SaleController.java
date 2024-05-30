package com.tasf.practica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/sale")
public class SaleController {



    @GetMapping("/")
    public ModelAndView sale (){

        return new ModelAndView("sales/sales");
    }

}
