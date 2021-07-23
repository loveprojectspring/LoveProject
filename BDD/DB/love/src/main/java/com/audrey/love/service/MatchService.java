package com.audrey.love.service;

import com.audrey.love.dao.MatchRepository;
import com.audrey.love.entity.Match;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import com.audrey.love.exception.BadRequestException;
import javassist.NotFoundException;

import java.util.List;

@Service
public class MatchService {

    @Autowired
    MatchRepository repository;

    public List<Match> getAll() {
        return repository.findAll();
    }

    public Match create(Match match) {

        Match newMatch = new Match();

        repository.save(newMatch);
        return newMatch;
    }

    public List<Match> getMatch(Integer id) throws NotFoundException {
        return repository.getMatch(id);
    }
    ////// K.O
}
