package com.audrey.love.controller;

import com.audrey.love.dto.LoverDTO;
import com.audrey.love.entity.Lover;
import com.audrey.love.service.LoverService;
import javassist.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lover")
public class LoverController {

    private final LoverService loverService;

    public LoverController(LoverService loverService) {
        this.loverService = loverService;
    }

    @GetMapping
    public List<Lover> getAll() {
        return loverService.getAll();
    }

    @GetMapping("/{id}")
    public Lover get(@PathVariable("id") Integer id) throws NotFoundException {
        return loverService.getLover(id);
    }

    @PostMapping
    public Lover create(@RequestBody Lover lover) {
        return loverService.create(lover);
    }

    @PutMapping(path = "{id}")
    public Lover update(@PathVariable Integer id, @RequestBody Lover lover) throws NotFoundException {
        return loverService.editLover(id,lover);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Integer id) throws NotFoundException {
        return loverService.deleteLover(id);
    }











}
