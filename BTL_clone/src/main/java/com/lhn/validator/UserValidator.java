/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.lhn.validator;

import com.lhn.pojo.User;
import com.lhn.service.UserService;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import javax.validation.ConstraintViolation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

/**
 *
 * @author Admin
 */
@Component
public class UserValidator implements Validator{
    @Autowired
    private javax.validation.Validator beanValidator;
    @Autowired
    private UserService userService;
    

    @Override
    public boolean supports(Class<?> clazz) {
        return User.class.isAssignableFrom(clazz);
    }

    @Override
    public void validate(Object target, Errors errors) {
        Set<ConstraintViolation<Object>> constraint = this.beanValidator.validate(target);
        
        for(ConstraintViolation<Object> obj: constraint)
            errors.rejectValue(obj.getPropertyPath().toString(), obj.getMessageTemplate(), obj.getMessage());
        
        User u = (User)target;
        
        Map<String, String> param = new HashMap<>();
        param.put("username", u.getFullname());
        param.put("phone", u.getPhone());
        if(this.userService.getUsers(param).size() > 0){
            errors.rejectValue("phone", "User exists");
            errors.rejectValue("username", "User exists");
        }
        
        if(!u.getUsername().matches("[^\\s-]"))
            errors.rejectValue("username", "Remove whitespace in username");
        
        if(!u.getPassword().matches("[^\\s-]"))
            errors.rejectValue("username", "Remove whitespace in username");
        
        if (!u.getPassword().trim().equals(u.getConfirmPassword().trim()))
            errors.rejectValue("password", "user.password.error.notMatchMsg");
    }
    
}
