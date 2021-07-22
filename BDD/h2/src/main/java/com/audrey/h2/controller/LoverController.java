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

import com.audrey.h2.entity.Lover;
import com.audrey.h2.repository.LoverRepository;

@RestController
@RequestMapping("/api")
public class LoverController {

    @Autowired
    LoverRepository loverRepo;

    @GetMapping("/lovers")
    public ResponseEntity<List<Lover>> getAllLovers() {
        try {
            List<Lover> list = loverRepo.findAll();

            if (list.isEmpty() || list.size() == 0) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(list, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/lovers/{id}")
    public ResponseEntity<Lover> getLover(@PathVariable Long id) {
        Optional<Lover> lover = loverRepo.findById(id);

        if (lover.isPresent()) {
            return new ResponseEntity<>(lover.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/lovers")
    public ResponseEntity<Lover> saveLover(@RequestBody Lover lover) {
        try {
            return new ResponseEntity<>(loverRepo.save(lover), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/lovers")
    public ResponseEntity<Lover> updateLover(@RequestBody Lover lover) {
        try {
            return new ResponseEntity<>(loverRepo.save(lover), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

