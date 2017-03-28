package com.tamdu.service;

/**
 * Created by dusica on 28.3.17..
 */
public interface SecurityService {

    String findLoggedInUsername();

    void autologin(String username, String password);
}
