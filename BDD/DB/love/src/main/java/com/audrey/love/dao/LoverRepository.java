package com.audrey.love.dao;

import com.audrey.love.entity.Lover;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LoverRepository extends JpaRepository<Lover, Integer> {

    public Optional<Lover> findById(Integer id);
    public List<Lover> findByName(String name);
}
