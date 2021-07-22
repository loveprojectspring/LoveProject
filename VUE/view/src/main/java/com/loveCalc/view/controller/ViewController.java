package com.loveCalc.view.controller;

import com.loveCalc.view.dto.Couple;
import com.loveCalc.view.dto.Person;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class ViewController {
    Couple matched = new Couple();

    @GetMapping
    public String homePage(Model model) {

        if(matched.getPercentage() == null){
            matched.setPercentage("0");
        }
        model.addAttribute("couple", matched);
        return "home";
    }

    @GetMapping("/couple")
    public String coupleList(Model model) {
        return "couple";
    }

    @PostMapping(value = "/match/", consumes = MediaType.ALL_VALUE)
    public String makeMatch(Couple couple){

        matched = couple;
        System.out.println(couple);
        return "redirect:/";

    }
}
