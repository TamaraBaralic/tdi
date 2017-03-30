package com.tamdu.controller;

import com.tamdu.entity.Offer;
import com.tamdu.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by tamara on 27.3.17..
 */
@RestController
public class OfferController {

    @Autowired
    OfferService offerService;

    @RequestMapping("/offers/allOffers")
    public final ArrayList<Offer> getAllOffers(){
        return offerService.getAllOffers();
    }

}
