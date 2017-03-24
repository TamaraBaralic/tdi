package com.tamdu.repository;

import com.tamdu.entity.Company;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by dusica on 24.3.17..
 */
public interface CompanyRepository extends PagingAndSortingRepository<Company, String> {
}
