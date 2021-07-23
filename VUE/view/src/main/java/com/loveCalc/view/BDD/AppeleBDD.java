package com.loveCalc.view.BDD;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.loveCalc.view.dto.Couple;

public class AppeleBDD {
	
	private static String urlBDD ="https://localhost:8500/";

    public static List<Couple> getListCouple(){
    	
        RestTemplate restTemplate = new RestTemplate();

        /** Lancement de la requête **/
        try {
            ResponseEntity<Map> response = restTemplate.exchange(urlBDD+"", HttpMethod.GET,null, Map.class);
            response.getBody();
		} catch (Exception e) {
			
		}

        List<Couple> listeDesCouples = new ArrayList<Couple>();
        /** Récuperer la liste des couples dans le body et l'inserer dans listeDesCouples **/
        
        listeDesCouples.add(new Couple("1", "Clement", "michelMonBienAimé", 100, "Le plus beau de tout les couples"));
        listeDesCouples.add(new Couple("2", "Jaques", "Eslam", 90, "Le plus beau"));
        listeDesCouples.add(new Couple("3", "Nicolas", "SonChien", 80, "Le plus beau de tou"));
        listeDesCouples.add(new Couple("4", "AUdrey", "Hugo", 200, "Du jamais vus !"));
        
        
        return listeDesCouples;

    }

    public static Couple sendCoupleBdd(Couple couple){
        /**
         * Appel au micro service Bdd à venir
         */

        return couple;
    }
}
