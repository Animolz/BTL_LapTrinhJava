/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhn.controller;

import com.lhn.service.PostService;
import com.lhn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Admin
 */
@Controller
public class HomeController {
    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;
    
    @GetMapping(path = {"/home"})
    public String home(Model model){
        model.addAttribute("user", this.userService.getUsers(null).get(0));
        model.addAttribute("posts",this.postService.getPosts(null));
        return "index";
    }
    
    @GetMapping(path = {"/profile"})
    public String profile(Model model){
        return "profile";
    }
}
