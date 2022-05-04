/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhn.controller;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.lhn.pojo.User;
import com.lhn.service.UserService;
import java.io.IOException;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Admin
 */
@Controller
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private Cloudinary cloudinary;
    
    @GetMapping(path = {"/"})
    public String login(Model model){
        return "user-login";
    }
    
    @GetMapping("/user-register")
    public String register(Model model){
        model.addAttribute("user", new User());
        return "user-register";
    }
    
    @PostMapping(path = {"/user-register/add"})
    public String addUser(Model model,
                @ModelAttribute(value = "user") User user){
        if(user.getFile() != null){
            try{
                Map r = this.cloudinary.uploader().upload(user.getFile().getBytes(), ObjectUtils.asMap("resource_type", "auto"));
                user.setAvatar(r.get("secure_url").toString());
            }catch(IOException ex){
                ex.printStackTrace();
            }
        }
        if(this.userService.addUser(user))
            return "redirect:/";
        else{
            model.addAttribute("error", "There's an error when we tried to register your account!!!");
            return "forward:/user-register";
        }
    }
}
