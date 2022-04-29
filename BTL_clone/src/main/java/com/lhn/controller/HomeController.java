/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Admin
 */
@Controller
public class HomeController {
    @RequestMapping("/")
    public String index(Model model){
        return "index";
    }
    
    @RequestMapping("/user-login")
    public String login(Model model){
        return "user-login";
    }
    
    @RequestMapping("/admin")
    public String admin(Model model){
        return "admin";
    }
    
    @RequestMapping("/profile")
    public String profile(Model model){
        return "profile";
    }
}
