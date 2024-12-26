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

import com.tka.IPL_REST_API.model.Player;
import com.tka.IPL_REST_API.service.PlayerService;

@RestController
public class PlayerController {

	@Autowired
	private PlayerService playerService;
	
	@PostMapping("/api/players")
	public String addNewPlayer(@RequestBody Player player ) {
		
		String msg = playerService.addNewPlayer(player);
		
		return msg;	
		
	}
	
	@GetMapping("/api/players")
	public List<Player> viewAllPlayers(){
		
		List<Player> players = playerService.viewAllPlayers();
		
		return players;
		
	}
	
	@GetMapping("/api/players/{id}")
	public Object getPlayerById(@PathVariable int id) {
		
		Player player = playerService.getPlayerById(id);
		
		if(player != null) {
		return player;
		
		}
		
		return "not found";
	}
	
	@DeleteMapping("/api/players/{id}")
	public String deletePlayerById(@PathVariable int id) {
	
		
		String msg = playerService.deletePlayerById(id);
		
		if(msg != null) {
		return msg;	
		}
		
		return "player not found";
	}
	
	@PutMapping("/api/players/{id}")
	public String updatePlayerById(@PathVariable int id,@RequestBody Player updated) {
		
		String msg = playerService.updatePlayerById(id, updated);
		
		if(msg!=null) {
		return msg;
		}
		return "player id not found";
	
	}
	
	
	
}
