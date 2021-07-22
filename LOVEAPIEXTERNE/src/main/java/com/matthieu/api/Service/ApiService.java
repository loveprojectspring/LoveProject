package com.matthieu.api.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.matthieu.api.Entity.Request;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class ApiService {

    private RestTemplate restTemplate;
    private HttpHeaders httpHeaders;
    private HttpEntity<String> entity;


    public Map getRequestApiExterne(String name1, String name2){

        restTemplate = new RestTemplate();
        httpHeaders = new HttpHeaders();

        /** Instance de la requête **/
        Request request = new Request("https://love-calculator.p.rapidapi.com/getPercentage?fname="+name1+"&sname="+name2);
        Request header1 = new Request("x-rapidapi-key", "d1165b9a98mshf4ea73ce820e691p1a2693jsnd70e37ec072a");
        Request header2 = new Request("x-rapidapi-host", "love-calculator.p.rapidapi.com");

        /** Création des headers **/
        httpHeaders.set(header1.getHeaderName(), header1.getHeaderContent());
        httpHeaders.set(header2.getHeaderName(), header2.getHeaderContent());

        /** Ajout des headers **/
        entity = new HttpEntity<>(httpHeaders);

        /** Lancement de la requête **/
        ResponseEntity<Map> response = restTemplate.exchange(request.getUrl(), HttpMethod.GET, entity, Map.class);

        return response.getBody();

    }
}
