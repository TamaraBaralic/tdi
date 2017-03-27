package com.tamdu.service;

import com.tamdu.entity.Company;
import com.tamdu.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by dusica on 24.3.17..
 */

@Service
public class CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public Collection<Company> getAllCompanies() {
        return (Collection<Company>) companyRepository.findAll();
    }

    public void insertCompany(Company company) {
        companyRepository.save(company);
    }
}
