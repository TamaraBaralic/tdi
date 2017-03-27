package com.tamdu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dusica on 24.3.17..
 */

@Controller
public class DashboardController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @RequestMapping("/companies")
    public String company() {
        return "company";
    }

    @RequestMapping("/users")
    public String createUser(){ return "user"; }

    @RequestMapping("/offers/allOffers")
    public String offersList(){ return "offers"; }
}
