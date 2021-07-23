package com.loveCalc.view.service;

import com.loveCalc.view.dto.Couple;
import com.loveCalc.view.dto.CoupleApi;
import org.springframework.core.ParameterizedTypeReference;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


import java.util.List;


public class RequestService {


    private RestTemplate restTemplate;
    private CoupleApi response;
    private List<Couple> responseBDD;
    public void addServiceApi(String url){

        restTemplate = new RestTemplate();
        ResponseEntity<CoupleApi> response = restTemplate.getForEntity(url, CoupleApi.class);
        this.response = response.getBody();
    }


    public void addServiceBDD(String url){

        restTemplate = new RestTemplate();
        ResponseEntity<List<Couple>> response = restTemplate.exchange(
                url,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<Couple>>() {}
        );
        this.responseBDD = response.getBody();
    }
    public CoupleApi getResponse(){
        return this.response;
    }

    public  List<Couple> getResponseBDD(){
        return this.responseBDD;
    }
}
