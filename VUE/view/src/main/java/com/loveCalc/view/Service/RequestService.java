package com.loveCalc.view.Service;

import com.loveCalc.view.dto.Couple;
import com.loveCalc.view.dto.CoupleApi;
import org.apache.coyote.Response;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

public class RequestService {


    private RestTemplate restTemplate;
    private CoupleApi response;

    public void addServiceApi(String url){

        restTemplate = new RestTemplate();
        ResponseEntity<CoupleApi> response = restTemplate.getForEntity(url, CoupleApi.class);
        this.response = response.getBody();
    }

    public CoupleApi getResponse(){
        return this.response;
    }
}
