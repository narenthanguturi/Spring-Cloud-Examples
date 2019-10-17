package com.example.server;

import com.example.server.interfaces.TeamRepository;
import com.example.server.model.Team;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@EnableConfigServer
@SpringBootApplication
public class ServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServerApplication.class, args);
	}

	@Autowired
	TeamRepository teamRepository;

	@PostConstruct
	public void init() {
		List<Team> list = new ArrayList<>();

		Team team = new Team();
		team.setLocation("Harlem");
		team.setName("Globetrotter");
		list.add(team);

		team = new Team();
		team.setLocation("Washington");
		team.setName("Generals");
		list.add(team);

		teamRepository.saveAll(list);
	}
}
