package com.tasf.practica.controllers;


import com.tasf.practica.models.User;
import com.tasf.practica.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("login")
public class LoginController {


    @Autowired
    private LoginService loginService;


    @GetMapping("/")
    public ModelAndView login (){


        return new ModelAndView("login");
    }


    @GetMapping("/register")
    public ModelAndView register (){


        return new ModelAndView("register");
    }


    @PostMapping("/login")
    public ModelAndView doLogin (@ModelAttribute User user,Model model) {

        Boolean isLogin =  loginService.login(user.getUsername(), user.getPassword());

        if (isLogin){

            return new ModelAndView("redirect:/");

        }

        model.addAttribute("error","Usuario o contraseña incorrectos, registrarse");

        return new ModelAndView("login");
    }



    @PostMapping("/register")
    public ModelAndView register (@ModelAttribute User user, Model model) {
        try{
            loginService.register(user);
            return new ModelAndView("redirect:/");
        }catch(Exception ex){
            model.addAttribute("error",ex.getMessage());
            return new ModelAndView("register");
        }
    }






}
