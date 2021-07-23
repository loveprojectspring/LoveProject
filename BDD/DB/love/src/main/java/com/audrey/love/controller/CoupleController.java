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

    @Autowired
    private MatchService matchService;
    @Autowired
    private LoverService loveService;

    list<Couple> couple = new ArrayList<Couple>();

    @GetMapping("/couple")
    public List<Couple> getCouple(Couple couple) {

        couple.add('Clément', 'Clément', 99, 'Le centipède')
        couple.add('Mickey', 'Jef Bezos', 12, 'La magie de disney n\'opère pas ')
        couple.add('Luke', 'Anakin', 99, 'Tant que ca reste en famille')
        couple.add('RIRI', 'FIFI', 99, 'OUAH')
        couple.add('LOULOU', 'POUTOU', 2, 'LOVE')
        couple.add('Lama', 'Scarabet', 19, 'L\'amour est dans le prés')
        couple.add("Chien", "Chat", 0, 'Les poilus')
        couple.add('Eslam', 'Hugo', 20000, 'Spring power')
        couple.add('Mathieu', 'Gateway', 99, 'Il faut passer par là')


                return couple;

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