package com.audrey.h2.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.audrey.h2.entity.Match;
import com.audrey.h2.repository.MatchRepository;

@RestController
@RequestMapping("/api")

public class MatchController {
    @Autowired
    MatchRepository matchRepo;

    @GetMapping("/matchs")
    public ResponseEntity<List<Match>> getAllMatches() {
        try {
            List<Match> list = matchRepo.findAll();

            if (list.isEmpty() || list.size() == 0) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/matchs/{id}")
    public ResponseEntity<Match> getMatch(@PathVariable Long id) {
        Optional<Match> match = matchRepo.findById(id);

        if (match.isPresent()) {
            return new ResponseEntity<>(match.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/matchs")
    public ResponseEntity<Match> saveMatch(@RequestBody Match match) {
        try {
            return new ResponseEntity<>(matchRepo.save(match), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/matchs")
    public ResponseEntity<Match> updateMatch(@RequestBody Match match) {
        try {
            return new ResponseEntity<>(matchRepo.save(match), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
