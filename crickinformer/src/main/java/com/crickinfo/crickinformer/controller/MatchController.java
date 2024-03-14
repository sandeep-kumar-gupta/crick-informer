package com.crickinfo.crickinformer.controller;

import com.crickinfo.crickinformer.entities.Match;
import com.crickinfo.crickinformer.service.MatchService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
public class MatchController {

    private MatchService matchService;

    public MatchController(MatchService matchService) {
        this.matchService = matchService;
    }
    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMAtches(){

        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }
}
