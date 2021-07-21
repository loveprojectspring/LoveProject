package com.matthieu.api.Controller;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.matthieu.api.Entity.Request;
import org.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@RestController
public class ApiController {

    private RestTemplate restTemplate;
    private HttpHeaders httpHeaders;
    private HttpEntity<String> entity;

    @RequestMapping(
            value="/getResponseApi",
            method = RequestMethod.GET
    )
    public Map getResponse()
    {

        restTemplate = new RestTemplate();
        httpHeaders = new HttpHeaders();

        /** Instance de la requête **/
        Request request = new Request("https://love-calculator.p.rapidapi.com/getPercentage?fname=John&sname=Alice");
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
