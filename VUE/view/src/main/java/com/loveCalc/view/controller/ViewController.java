package com.loveCalc.view.controller;

import com.loveCalc.view.dto.Couple;
import com.loveCalc.view.dto.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewController {

    @GetMapping
    public String homePage(Model model) {
        Couple couple = new Couple();
        couple.setFirstPerson("sam");
        couple.setPercentage("69");
        couple.setSecondPerson("Han");
        model.addAttribute("couple", couple);
        return "home";
    }

    @GetMapping("/couple")
    public String coupleList(Model model) {
        return "couple";
    }

    @PostMapping("/match")
    public String makeMatch(Person firstPerson, Person secondPerson){
        return "home";

    }
}
