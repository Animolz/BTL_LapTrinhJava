/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhn.service.impl;

import com.lhn.pojo.User;
import com.lhn.repository.UserRepository;
import com.lhn.service.UserService;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getUsers(Map<String, String> param) {
        return this.userRepository.getUsers(param);
    }

    @Override
    public boolean addUser(User user) {
        return this.userRepository.addUser(user);
    }

    @Override
    public boolean updateUser(User user, int id) {
        return this.userRepository.updateUser(user, id);
    }

    @Override
    public boolean deleteUser(int id) {
        return this.userRepository.deleteUser(id);
    }

    @Override
    public boolean updateActive(User user) {
        return this.userRepository.updateActive(user);
    }

    @Override
    public boolean banUser(User user) {
       return this.userRepository.banUser(user);
    }

    @Override
    public boolean unbanUser(User user) {
        return this.userRepository.unbanUser(user);
    }
   
    
}
