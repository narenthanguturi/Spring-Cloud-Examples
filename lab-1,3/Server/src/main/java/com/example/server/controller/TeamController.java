package com.example.server.controller;

import com.example.server.interfaces.TeamRepository;
import com.example.server.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    @Autowired
    TeamRepository teamRepository;

    @GetMapping("/teams")
    public Iterable<Team> getTeams() {
        return teamRepository.findAll();
    }

    @GetMapping("/teams/{id}")
    public Team getTeamById(
            @PathVariable long id
    ) {
        return teamRepository.findById(id).get();
    }
}
