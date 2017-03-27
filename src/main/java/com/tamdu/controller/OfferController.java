package com.tamdu.controller;

import com.tamdu.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by tamara on 27.3.17..
 */
@Controller
@RequestMapping("/offers")
public class OfferController {

    @Autowired
    OfferService offerService;

    @RequestMapping("/allOffers")
    public final String getAllOffers(){
        return "offers";
    }

}
