package com.loveCalc.view.controller;


import com.loveCalc.view.dto.Couple;
import com.loveCalc.view.dto.CoupleApi;
import com.loveCalc.view.service.RequestService;

import java.io.IOException;

public class CallApiExterneController {

	private static String uriServiceAPI ="http://localhost:8200";
	
    public static Couple callServiceApi(String name1, String name2) throws IOException {
        /** Instance du service de la request **/
        RequestService requestService = new RequestService();

        /** Appel du micro service de l'API **/
        /** Test **/
//        requestService.addServiceApi("http://localhost:8600/response/Michel/Claudine");
        /** Dynamic **/
        requestService.addServiceApi(uriServiceAPI+"/response/"+name1+"/"+name2);

        /** Service result **/
        CoupleApi rsp = requestService.getResponse();

        /** Instance de coupleApi **/
        CoupleApi coupleApi = new CoupleApi(rsp.getFname(), rsp.getSname(), rsp.getPercentage(), rsp.getResult());

        /** Instance de couple **/
        Couple couple = new Couple();
        couple.setFirstPerson(coupleApi.getFname());
        couple.setSecondPerson(coupleApi.getSname());
        couple.setPercentage(Integer.parseInt(coupleApi.getPercentage()));
        couple.setResultMessage(coupleApi.getResult());

        System.out.println(coupleApi);
        System.out.println(couple);

        return couple;

    }
}
