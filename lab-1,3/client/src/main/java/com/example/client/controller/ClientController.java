package com.example.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    @Value("${random}") String value;
    @Value("${teamNames}") List<String> teamNames;

    @GetMapping("/get-value")
    public String showValue() {
        return "The value is: " + value;
    }

    @GetMapping("/get-team-names")
    public String getTeamNames() {
        return "The team names are: " + teamNames;
    }
}
