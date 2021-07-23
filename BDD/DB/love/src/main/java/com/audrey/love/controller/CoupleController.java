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

    couple.add('Clément','Clément',99,'Le centipède')
    couple.add('Mickey','Jef Bezos',12,'La magie de disney n\'opère pas ')
    couple.add('Luke','Anakin',99,'Tant que ca reste en famille')
    couple.add('RIRI','FIFI',99,'OUAH')
    couple.add('LOULOU','POUTOU',2,'LOVE')
    couple.add('Lama','Scarabet',19,'L\'amour est dans le prés')
    couple.add("Chien","Chat",0,'Les poilus')
    couple.add('Eslam','Hugo',20000,'Spring power')
    couple.add('Mathieu','Gateway',99,'Il faut passer par là')

/*   wtf

    public void getLover(Couple couple){
        couple.add(couple);
    }*/


}