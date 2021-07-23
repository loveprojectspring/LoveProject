package com.loveCalc.view.BDD;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.loveCalc.view.controller.CallBDD;
import com.loveCalc.view.service.RequestService;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.loveCalc.view.dto.Couple;

public class AppeleBDD {
	
//	private static String urlBDD ="https://localhost:8090/";

    public static List<Couple> getListCouple(){
    	
        RestTemplate restTemplate = new RestTemplate();

//        /** Lancement de la requête **/
//        try {
//            ResponseEntity<Map> response = restTemplate.exchange(urlBDD+"/couples", HttpMethod.GET,null, Map.class);
//            response.getBody();
//		} catch (Exception e) {
//
//		}


        List<Couple> listeDesCouples = CallBDD.responseBDD();
        /** Récuperer la liste des couples dans le body et l'inserer dans listeDesCouples **/


        
        
        return listeDesCouples;

    }

    public static Couple sendCoupleBdd(Couple couple){
        /**
         * Appel au micro service Bdd à venir
         */

        return couple;
    }
}
