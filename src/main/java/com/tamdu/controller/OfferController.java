package com.tamdu.controller;

import com.tamdu.entity.Offer;
import com.tamdu.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by tamara on 27.3.17..
 */
@RestController
@RequestMapping("/offers")
public class OfferController {

    @Autowired
    OfferService offerService;

    @RequestMapping("/getAllOffers")
    public final ArrayList<Offer> getAllOffers(){
        return offerService.getAllOffers();
    }

}
