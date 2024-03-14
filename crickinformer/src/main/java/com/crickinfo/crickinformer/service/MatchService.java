package com.crickinfo.crickinformer.service;

import com.crickinfo.crickinformer.entities.Match;

import java.util.List;
import java.util.Map;

public interface MatchService {

    //get all matches
    List<Match> getAllMatches();

    //get live matches
    List<Match> getLiveMatches();
    //get worldcup point table

    List<Map<String,String>> getPointTable();

}
