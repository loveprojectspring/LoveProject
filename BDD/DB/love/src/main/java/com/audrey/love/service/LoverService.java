package com.audrey.love.service;

import com.audrey.love.entity.Lover;
import com.audrey.love.dao.LoverRepository;
import com.audrey.love.exception.NotFoundException;
import com.audrey.love.exception.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoverService {

    @Autowired
    LoverRepository repository;

    public List<Lover> getAll() {
        return repository.findAll();
    }
    public Lover create(Lover lover) {
        if (lover.getName() == null ) {
            throw new BadRequestException("empty field not accepted");
        }

        Lover newLover = new Lover();

        newLover.setName(lover.getName());

        repository.save(newLover);
        return newLover;
    }

    public Lover getLover(Integer id) throws NotFoundException {
        return repository.findById(id).orElseThrow(()->new NotFoundException("this lover is not available"));
    }

    public Lover login(String name) throws NotFoundException {
        try {
            return repository.findByName(name).get(0);
        }catch (Exception e){
            throw new NotFoundException("this lover is not available");
        }
    }

    public Lover editLover(Integer id,Lover lover) throws NotFoundException{
        if(lover.getName() == null || lover.getName().isEmpty()){
            throw new BadRequestException("empty field not accepted");
        }
        Lover modifiedLover = repository.findById(id).orElseThrow(()->new NotFoundException("this lover is not available"));

        modifiedLover.setName(lover.getName());

        repository.save(modifiedLover);
        return modifiedLover;
    }


    public ResponseEntity<String> deleteLover(Integer id) throws NotFoundException {
        Lover lover = this.getLover(id);
        repository.delete(lover);
        return ResponseEntity.status(HttpStatus.OK).body("lover ("+lover.getName()+") has been deleted");
    }
}
