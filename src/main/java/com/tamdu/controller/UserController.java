package com.tamdu.controller;

import com.tamdu.entity.User;
import com.tamdu.repository.UserRepository;
import com.tamdu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**
 * Created by tamara on 24.3.17..
 */
@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/getAllUsers")
    public ArrayList<User> getUsers(){ return userService.getAllUsers(); }

    @RequestMapping(value = "/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public User saveUser(String username, String password){
        User user = new User();
        user.setName(username);
        user.setPassword(password);

        userService.save(user);

        return user;
    }
}
