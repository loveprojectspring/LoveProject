package com.loveCalc.view.controller;

import com.loveCalc.view.BDD.AppeleBDD;
import com.loveCalc.view.dto.Couple;
import com.loveCalc.view.dto.Person;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.loveCalc.view.BDD.AppeleBDD.sendCoupleBdd;
import static com.loveCalc.view.controller.CallApiExterneController.callServiceApi;

@Controller
public class ViewController {
    Couple matched = new Couple();
    List<Couple> couples =  CallBDD.responseBDD();

    @GetMapping
    public String homePage(Model model) {
        Couple matched = new Couple();
        model.addAttribute("couple", matched);
        return "home";
    }

    @PostMapping(value = "/match/", consumes = MediaType.ALL_VALUE)
    public String makeMatch(Couple couple,Model model) throws IOException {
        Couple matched = new Couple();

        String fname = couple.getFirstPerson();
        String sname = couple.getSecondPerson();
        couple =  callServiceApi(fname,sname);
//        System.out.println(couple);
        sendCoupleBdd(couple);
//        couples.add(couple);
        matched = couple;
        model.addAttribute("couple", matched);

        System.out.println(couple);
        return "home";//"redirect:/";
    }
    
    @GetMapping("/couple")
    public String coupleList(Model model) {
        model.addAttribute("couples", couples);
        return "couple";
    }
}
