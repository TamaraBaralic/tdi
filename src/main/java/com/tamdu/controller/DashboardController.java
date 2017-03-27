package com.tamdu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}
