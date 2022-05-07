/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhn.repository;

import com.lhn.pojo.Tag;
import java.util.List;

/**
 *
 * @author Admin
 */
public interface TagRepository {
    List<Tag> getTags(String tag);
    List<Tag> getTagsByPostId(int postId);
    boolean addTag(Tag tag);
    boolean updateTag(Tag tag, int id);
    boolean deleteTag(int id); 
    Tag findById(int id);
}

