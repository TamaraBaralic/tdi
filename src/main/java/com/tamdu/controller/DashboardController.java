package com.tamdu.controller;

import com.tamdu.entity.Company;
import com.tamdu.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by dusica on 24.3.17..
 */

@RestController
@RequestMapping("/")
public class DashboardController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/getAllCompanies")
    public Collection<Company> getAllCompanies() {
        return null;
    }
}
