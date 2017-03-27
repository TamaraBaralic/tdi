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

/**add html5 support thymleaf
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
        User user = userService.findUserByName(username);
        if(user == null) {
            User newUser = new User();
            newUser.setName(username);
            newUser.setPassword(password);
            userService.save(newUser);

            return newUser;
        }
        else
            return user;
    }
}
