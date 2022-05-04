/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhn.service.impl;

import com.lhn.pojo.User;
import com.lhn.repository.UserRepository;
import com.lhn.service.UserService;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service("userDetailsService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public List<User> getUsers(Map<String, String> param) {
        return this.userRepository.getUsers(param);
    }

    @Override
    public boolean addUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
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

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Map<String, String> param = new HashMap<>();
        param.put("username", username);
        
        List<User> users = this.userRepository.getUsers(param);
        if(users.isEmpty())
            throw new UsernameNotFoundException("User does not exist!");
        
        User user = users.get(0);
        
        Set<GrantedAuthority> auth = new HashSet<>();
        auth.add(new SimpleGrantedAuthority(user.getRole()));
        
        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), auth);
    }
}
