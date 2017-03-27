package com.tamdu.repository;

import com.tamdu.entity.Offer;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.ArrayList;

/**
 * Created by tamara on 27.3.17..
 */
public interface OfferRepository extends PagingAndSortingRepository<Offer, String> {

    public ArrayList<Offer> findAll();

}
