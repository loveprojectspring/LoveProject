package com.audrey.love.controller;

import com.audrey.love.entity.Match;
import com.audrey.love.service.MatchService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javassist.NotFoundException;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    private final MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }

    @GetMapping
    public List<Match> getAll() {
        return matchService.getAll();
    }

//    @GetMapping("/{id}")
//    public Match get(@PathVariable("id") Integer id) throws NotFoundException {
//        return matchService.getMatch(id);
//    }
}
