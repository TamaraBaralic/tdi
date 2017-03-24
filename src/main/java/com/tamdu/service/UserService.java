package com.tamdu.service;

import com.tamdu.entity.User;
import com.tamdu.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Set;

/**
 * Created by tamara on 24.3.17..
 */
@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public ArrayList<User> getAllUsers() { return (ArrayList<User>) userRepository.findAll(); }
}
