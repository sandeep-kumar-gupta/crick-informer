package com.crickinfo.crickinformer.repositories;

import com.crickinfo.crickinformer.entities.Match;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MatchRepo extends JpaRepository<Match,Long> {

    //fetch the match by team name
    Optional<Match> findByTeamHeading(String teamHeading);
}
