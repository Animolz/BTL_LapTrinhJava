/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhn.service.impl;

import com.lhn.pojo.Like1;
import com.lhn.repository.StatsRepository;
import com.lhn.service.StatsService;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class StatsServiceImpl implements StatsService{
    @Autowired
    private StatsRepository statsRepository;

    @Override
    public List<Object[]> countPosts() {
        return this.statsRepository.countPosts();
    }

    @Override
    public List<Object[]> getAuctionPosts() {
        return this.statsRepository.countAuctionPosts();
    }

    @Override
    public List<Like1> countLike(Date startDate, Date endDate) {
        return this.statsRepository.countLike(startDate, endDate);
    }
    
}
