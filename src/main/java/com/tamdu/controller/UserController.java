package com.tamdu.controller;

import com.tamdu.entity.User;
import com.tamdu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

/**
 * Created by tamara on 24.3.17..
 */
@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/users")
    public ArrayList<User> getUsers(){ return userService.getAllUsers(); }
}
