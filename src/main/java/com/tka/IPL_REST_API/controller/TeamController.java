package com.tka.IPL_REST_API.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.tka.IPL_REST_API.model.Team;
import com.tka.IPL_REST_API.service.TeamService;

@RestController
public class TeamController {

	@Autowired
	private TeamService teamService;

	@PostMapping("/api/teams")
	public Object addTeam(@RequestBody Team team) {

		System.err.println(team);

		Object Team = teamService.addTeam(team);

		return Team;

	}

	@GetMapping("/api/teams")
	public List<Team> viewAllTeams() {

		List<Team> Teams = teamService.viewAllTeams();

		return Teams;

	}

	@GetMapping("/api/teams/{id}")
	public Object getTeamById(@PathVariable int id) {

		Team team = teamService.getTeamById(id);

		if (team != null) {

			return team;
		}

		return "not found";
	}

	@DeleteMapping("/api/teams/{id}")
	public String deleteTeamById(@PathVariable int id) {

		String msg = teamService.deleteTeamById(id);

		if (msg != null) {

			return msg;

		}

		return "not found";
	}

	@PutMapping("/api/teams/{id}")
	public String updateTeamById(@PathVariable int id, @RequestBody Team updated) {

		String msg = teamService.updateTeamById(id, updated);

		
			return msg;
		
	}

}
