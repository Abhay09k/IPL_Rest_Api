package com.tka.IPL_REST_API.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.IPL_REST_API.dao.PlayerDao;
import com.tka.IPL_REST_API.model.Player;

@Service
public class PlayerService {

	@Autowired
	private PlayerDao playerDao;
	
  public String addNewPlayer(Player player) {
		
		String msg = playerDao.addNewPlayer(player);
		
		return msg;	
		
	}
	
  public List<Player> viewAllPlayers(){
		
	  List<Player> player = playerDao.viewAllPlayers();
		
		return player;
		
	}
	
  public Player getPlayerById( int id) {
		
		Player player = playerDao.getPlayerById(id);
		
		return player;
		
		
	}
	
  public String deletePlayerById( int id) {
		
		String msg = playerDao.deletePlayerById(id);
		
		
		return msg;	
	}

  
	public String updatePlayerById(int id, Player updated) {
		
		String msg = playerDao.updatePlayerById(id, updated);
		
		return msg;
	
	}




}
