package com.tamdu.controller;

import com.tamdu.entity.Company;
import com.tamdu.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by dusica on 24.3.17..
 */

@RestController
@RequestMapping("/companies")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping(value = "/getAllCompanies", method = RequestMethod.GET)
    public Collection<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertCompany(@RequestBody Company company) {
        companyService.insertCompany(company);
    }

}
