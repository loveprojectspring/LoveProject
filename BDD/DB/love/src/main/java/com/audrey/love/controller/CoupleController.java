package com.audrey.love.controller;

import com.audrey.love.dto.LoverDTO;
import com.audrey.love.entity.Lover;
import com.audrey.love.service.LoverService;
import javassist.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/couple")
public class LoverController {

    list<Couple> couple = new ArrayList<Couple>();

    public void add(Couple couple){
        couple.add(couple);
    }

}