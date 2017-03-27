package com.tamdu.service;

import com.tamdu.entity.Offer;
import com.tamdu.repository.OfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Created by tamara on 27.3.17..
 */
@Service
public class OfferService {

    @Autowired
    OfferRepository offerRepository;

    public ArrayList<Offer> getAllOffers(){
        return offerRepository.findAll();
    }
}
