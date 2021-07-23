package com.loveCalc.view.controller;


import com.loveCalc.view.dto.Couple;
import com.loveCalc.view.service.RequestService;

import java.util.ArrayList;
import java.util.List;


public class CallBDD {


    public static List<Couple> responseBDD(){
        RequestService requestService = new RequestService();
        requestService.addServiceBDD("http://localhost:8090/couple/couples");
        List<Couple> responseBDD = requestService.getResponseBDD();

        System.out.println(responseBDD);
        return responseBDD;

    }




}
