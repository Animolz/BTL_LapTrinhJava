/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhn.service.impl;

import com.lhn.pojo.Post;
import com.lhn.repository.PostRepository;
import com.lhn.service.PostService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class PostServiceImpl implements PostService{
    @Autowired
    private PostRepository postRepository;
    
    @Override
    public List<Object[]> getPosts(Map<String, String> param) {
        return this.postRepository.getPosts(param);
    }

    @Override
    public boolean disablePost(int postId) {
        return this.postRepository.disablePost(postId);
    }
    
}
