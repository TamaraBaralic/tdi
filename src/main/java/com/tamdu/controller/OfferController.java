package com.tamdu.controller;

import com.tamdu.entity.Offer;
import com.tamdu.service.OfferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Created by tamara on 27.3.17..
 */
@Controller
@RequestMapping("/offers")
public class OfferController {

    @Autowired
    OfferService offerService;

    @RequestMapping("/allOffers")
    @ResponseBody
    public final ArrayList<Offer> getAllOffers(){
        return offerService.getAllOffers();
    }

    @RequestMapping("/{id}")
    @ResponseBody
    public Offer getOfferById(@PathVariable String id) { return offerService.getOfferById(id); }

    @RequestMapping("/getOfferById/{id}")
    public String offerById(@PathVariable String id) { return "offer"; }

}
