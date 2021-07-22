package com.loveCalc.view.controller;

import com.loveCalc.view.BDD.AppeleBDD;
import com.loveCalc.view.dto.Couple;
import com.loveCalc.view.dto.Person;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Controller
@RequestMapping("/")
public class ViewController {
    Couple matched = new Couple();
    List<Couple> couples =  AppeleBDD.getListCouple();

    @GetMapping
    public String homePage(Model model) {


        model.addAttribute("couple", matched);
        return "home";
    }

    @GetMapping("/couple")
    public String coupleList(Model model) {
        model.addAttribute("couples", couples);
        return "couple";
    }

    @PostMapping(value = "/match/", consumes = MediaType.ALL_VALUE)
    public String makeMatch(Couple couple){

        Random r = new Random();
        int low = 10;
        int high = 100;
        int result = r.nextInt(high-low) + low;


        couple.setPercentage(result);

        couples.add(couple);
        matched = couple;
        System.out.println(couple);
        return "redirect:/";

    }
}
