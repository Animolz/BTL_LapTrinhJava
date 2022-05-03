/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhn.repository;

import com.lhn.pojo.Post;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public interface PostRepository {
    List<Object[]> getPosts(Map<String, String> param);
    boolean disablePost(int postId);
}
