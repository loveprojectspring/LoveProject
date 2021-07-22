package com.loveCalc.view.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/view")
public class ViewController {

    @GetMapping
    public String homePage(Model model) {
        return "home";
    }

    @GetMapping("/couple/")
    public String coupleList(Model model) {
        return "couple";
    }
}
