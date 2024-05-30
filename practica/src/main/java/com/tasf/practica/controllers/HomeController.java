package com.tasf.practica.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/")
public class HomeController {


    @RequestMapping()
    private ModelAndView index(){


        return new ModelAndView("index");
    }



}
