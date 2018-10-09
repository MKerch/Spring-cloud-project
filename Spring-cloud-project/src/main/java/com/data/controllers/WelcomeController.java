/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.data.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author kerch
 */
@Controller
public class WelcomeController {
    
    
    @GetMapping(value = "/welcome")
    public String sayWelcome(Model model){
        model.addAttribute("welcome", "Its me");
        return "welcome";
    }
    @GetMapping(value = "/")
    public String sayWelcome(){
        return "index";
    }
    
}
