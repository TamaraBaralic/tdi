package com.tamdu.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dusica on 24.3.17..
 */

@RestController
public class DashboardController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }

}
