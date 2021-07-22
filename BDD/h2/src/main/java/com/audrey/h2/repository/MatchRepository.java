package com.audrey.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.audrey.h2.entity.Match;

public interface MatchRepository extends JpaRepository<Match, Long> {


}
