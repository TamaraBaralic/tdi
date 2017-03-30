package com.tamdu.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Collection;

/**
 * Created by dusica on 24.3.17..
 */

@Controller
public class DashboardController {

    @RequestMapping("/companies")
    public String company() {
        return "company";
    }

    @RequestMapping("/users")
    public String createUser(){ return "user"; }

    @RequestMapping("/offers")
    public String offers(){ return "offers"; }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(Model model, String error, String logout) {

        if(error != null) {
            model.addAttribute("error", "Your username and password is invalid");
        }

        if(logout != null) {
            model.addAttribute("message", "You have been logged out successfully");
        }

        return "login";
    }

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public String index(Authentication authentication) {

        Collection<? extends GrantedAuthority> set = authentication.getAuthorities();
        String role = set.iterator().next().getAuthority();

        if(role.equals("admin")) {
            return "company";
        }
        else {
            return "offers";
        }
    }
}
