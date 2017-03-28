package com.tamdu.repository;

import com.tamdu.entity.Offer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by tamara on 27.3.17..
 */
public interface OfferRepository extends PagingAndSortingRepository<Offer, String> {

    ArrayList<Offer> findAll();

    @Query("select o from Offer o where o.company.id = :company_id")
    List<Offer> findByCompanyId(@Param("company_id") String company_id);



}
