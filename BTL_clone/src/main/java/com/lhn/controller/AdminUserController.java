/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhn.controller;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.lhn.pojo.Tag;
import com.lhn.pojo.User;
import com.lhn.service.TagService;
import com.lhn.service.UserService;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Admin
 */
@Controller
public class AdminUserController {
    @Autowired
    private UserService userService;
    @Autowired
    private Cloudinary cloudinary;
        
    @GetMapping(path = {"/admin-user"})
    public String adminUser(Model model, 
            @RequestParam(value = "kw", required = false) String kw){
        if(kw != null && !kw.isEmpty()){
            Map<String, String> param = new HashMap<>();
            kw = kw.trim().toLowerCase();
            param.put("kw", kw);
            param.put("phone", kw);
            param.put("username", kw);
            param.put("email", kw);
            model.addAttribute("users", this.userService.getUsers(param));
        }
        else model.addAttribute("users", this.userService.getUsers(null));
        
        return "admin-user";
    }
    
    @GetMapping(path = {"/admin-user/{userId}"})
    public String delete(@PathVariable(name = "userId") String userId){
        Map<String, String> param = new HashMap<>();
        param.put("id", userId);
        User user = this.userService.getUsers(param).get(0);
        if(this.userService.updateActive(user))
            return "redirect:/admin-user";
        else return "admin-user";
    }
    
    @GetMapping(path = {"/admin-user/input"})
    public String inputUser(Model model){
        model.addAttribute("user", new User());
        return "admin-user-input";
    }
    
    @PostMapping(path = {"/admin-user/input/add"})
    public String addUser(Model model,
            @ModelAttribute(value = "user") User user){
        if(this.userService.addUser(user))
            return "redirect:/admin-user";
        else{
            model.addAttribute("error", "There's an error when we tried to record your info!!!");
            return "forward:/admin-user/input";
        }
    }
    
    @PostMapping(path = {"/admin-user/input/{userId}/update"})
    public String updateUser(Model model,
            @ModelAttribute(value = "user") User user,
            @PathVariable(value = "userId") int id){
        if(this.userService.updateUser(user, id))
            return "redirect:/admin-user";
        else{
            model.addAttribute("error", "There's an error when we tried to record your info!!!");
            return "forward:/admin-user/input";
        }
    }
    
    @GetMapping(path = {"/admin-user/input/{userId}"})
    public String inputUser1(Model model,
            @PathVariable(value = "userId") String userId){
        if(userId != null && !userId.isEmpty()){
            Map<String, String> param = new HashMap<>();
            param.put("id", userId);
            User user = this.userService.getUsers(param).get(0);
            model.addAttribute("user", user);
        }
        return "admin-user-input1";
    }
    
    @GetMapping(path = "/admin-user/ban/{userId}")
    public String banUser(Model model,
            @PathVariable(value = "userId") String userId){
        if(userId != null && !userId.isEmpty()){
            Map<String, String> param = new HashMap<>();
            param.put("id", userId);
            User user = this.userService.getUsers(param).get(0);
            if(user.getIsBanned() == false){
                if(this.userService.banUser(user))
                    return "redirect:/admin-user";
                else{
                model.addAttribute("error", "There's an error when we tried to ban a user!!!");
                return "forward:/admin-user";
                }
            }else {
                 if(this.userService.unbanUser(user))
                    return "redirect:/admin-user";
                else{
                model.addAttribute("error", "There's an error when we tried to ban a user!!!");
                return "forward:/admin-user";
                 }
            }
        }
        return null;
    }
}
