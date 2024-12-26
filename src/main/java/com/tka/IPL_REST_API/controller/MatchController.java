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

import com.tka.IPL_REST_API.model.Matches;
import com.tka.IPL_REST_API.service.MatchService;

@RestController
public class MatchController {

	@Autowired
	private MatchService matchService;

	@PostMapping("/api/matches")
	public String addNewMatch(@RequestBody Matches matches) {

		String msg = matchService.addNewMatch(matches);

		return msg;

	}

	@GetMapping("/api/matches")
	public List<Matches> viewAllMatches() {

		List<Matches> matches = matchService.viewAllMatches();

		return matches;
	}

	@GetMapping("/api/matches/{id}")
	public Object getMatchById(@PathVariable int id) {

		Matches match = matchService.getMatchById(id);

		if (match != null) {
			return match;
		}
		return "not found";
	}

	@DeleteMapping("/api/matches/{id}")
	 public String deleteMatchById(@PathVariable int id) { 

		String msg = matchService.deleteMatchById(id);
	
	return msg;
	}
	
	@PutMapping("/api/matches/{id}")
	 public String updateMatchById(@PathVariable int id,@RequestBody Matches updated) {
			
	    	String msg = matchService.updateMatchById(id, updated);	
	    	
	    	return msg;    		    	
	    	
	    }
}
