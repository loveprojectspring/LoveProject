package com.audrey.love.controller;

import com.audrey.love.dto.LoverDTO;
import com.audrey.love.entity.Lover;
import com.audrey.love.service.LoverService;
import com.audrey.love.service.MatchService;
import com.audrey.love.vue.Couple;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/couple")
public class CoupleController {

    @Autowired
    private MatchService matchService;
    @Autowired
    private LoverService loveService;

    List<Couple> couples = new ArrayList<Couple>();

    @GetMapping("/couples")
    public List<Couple> getCouples(Couple couple) {

        couples.add(new Couple("1", "Clement", "michelMonBienAimé", 100, "Le plus beau de tout les couples"));
        couples.add(new Couple("2", "Jaques", "Eslam", 90, "Le plus beau"));
        couples.add(new Couple("3", "Nicolas", "SonChien", 80, "Le plus beau de tou"));
        couples.add(new Couple("4", "AUdrey", "Michael", 200, "Du jamais vus !"));
        couples.add(new Couple("5","Clément", "Clément", 99, "Le centipède"));
        couples.add(new Couple("6", "Mickey", "Jef Bezos", 12, "La magie de disney n\\'opère pas"));
        couples.add(new Couple("7", "Luke", "Anakin", 99, "Tant que ca reste en famille"));
        couples.add(new Couple("8", "Lama", "Scarabet", 19, "L\\'amour est dans le prés"));
        couples.add(new Couple("9", "Chien", "Chat", 0, "Les poilus"));


        return couples;

    /*    List<Match> matchs = matchService.getAll();
        List<Lover> lovers = loveService.getAll();
        List<Couple> couples = new ArrayList<Couple>();
         for (Match match : matchs) {
            Couple couple = new Couple();
            couple.setPercentage((int)Integer.getInteger(match.getPercentage()));
            couple.setResultMessage(match.getResult());
            int personne1id = match.getId_Lover1();
            int personne2id = match.getId_Lover2();
            for (Lover lover : lovers) {
                if(lover.getid()==personne1id) {
                    couple.setFirstPerson(lover.getName());
                }
                if(lover.getid()==personne2id) {
                    couple.setSecondPerson(lover.getName());
                }
            }
            couples.add(couple);

        }
         return couples;*/

    }



}