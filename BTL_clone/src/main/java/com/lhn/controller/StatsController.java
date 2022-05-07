/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhn.controller;

import com.lhn.service.StatsService;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author Admin
 */
@Controller
public class StatsController {
    @Autowired
    private StatsService statsService;
    private SimpleDateFormat F = new SimpleDateFormat("yyyy-mm-dd");
        
    @GetMapping(path = {"/admin/post-summary"})
    public String postSummary(Model model){
        model.addAttribute("post", this.statsService.countPosts());
        model.addAttribute("auction", this.statsService.getAuctionPosts());
        return "post-summary";
    }
    
    @GetMapping(path = {"/admin/like-summary"})
    public String likeSummary(Model model,
            @RequestParam(required = false) Map<String, String> param) throws ParseException{

        model.addAttribute("like", this.statsService.countLike(new Date(), new Date()));
        return "like-summary";
    }
}
