/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhn.service;

import com.lhn.pojo.User;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Admin
 */
public interface UserService {
    List<User> getUsers(Map<String, String> param);
    boolean addUser(User user);
    boolean updateUser(User user, int id);
    boolean deleteUser(User user);
    boolean updateActive(User user);
}
