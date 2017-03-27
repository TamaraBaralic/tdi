package com.tamdu.controller;

import com.tamdu.entity.Company;
import com.tamdu.entity.Offer;
import com.tamdu.service.CompanyService;
import com.tamdu.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

/**
 * Created by dusica on 24.3.17..
 */

@RestController
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @Autowired
    private OfferService offerService;

    @RequestMapping(value = "/companies/getAllCompanies", method = RequestMethod.GET)
    public Collection<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @RequestMapping(value = "/companies/save", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE)
    public void save(String name, String address, String telephone, String email) {

        System.out.println(name + " " + address + " " + telephone + " " + email);
        Company c = new Company();
        c.setName(name);
        c.setAddress(address);
        c.setTelephone(telephone);
        c.setEmail(email);
        System.out.println(c.toString());
        companyService.insertCompany(c);
    }

    @RequestMapping(value = "/company/{id}", method = RequestMethod.GET)
    public List<Offer> getOffers(@PathVariable("id") String id) {
        return offerService.getOffersForCompany(id);
    }
}
