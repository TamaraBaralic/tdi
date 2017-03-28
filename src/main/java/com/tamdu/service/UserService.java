package com.tamdu.service;

import com.tamdu.entity.Role;
import com.tamdu.entity.User;
import com.tamdu.repository.RoleRepository;
import com.tamdu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by tamara on 24.3.17..
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    RoleRepository roleRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    public ArrayList<User> getAllUsers() { return (ArrayList<User>) userRepository.findAll(); }

    public User save(User user){

        System.out.println(user);
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setRole(new Role(1, "admin"));
        return userRepository.save(user);
    }

    public User findUserByName(String name){
        User user = userRepository.findByName(name);
        return user;
    }
}
