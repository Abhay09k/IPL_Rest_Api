package com.tka.IPL_REST_API.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.tka.IPL_REST_API.model.Player;

@Repository
public class PlayerDao {

	
	List<Player> players = new ArrayList<Player>();
 
	public PlayerDao() {
	
	players.add(new Player(1, "Rohit", 32, "Mumbai", "Batsman"));
	players.add(new Player(2, "Virat", 31, "RCB", "Batsman"));
	
	}
	
	
	public String addNewPlayer(Player player) {
			
	     players.add(player);
		
		return "added succesfully";	
		
	}
   
	
	public List<Player> viewAllPlayers(){
		
		
		return players;
		
	}
	
   public Player getPlayerById(int id) {
		
		for (Player player : players) {
			if(player.getPlayerId()==id) {
				return player;
			}
		}
		
	    return null;
		
		
	}
	
   public String deletePlayerById( int id) {
		
		for (Player player : players) {
			
			if (player.getPlayerId()==id) {
				players.remove(player);
				return "player deleted successfully";	
			}
		}
		return null;	
		
		
	}
	
      
	    public String updatePlayerById(int id,Player updated) {
		
		for(int i =0 ; i<players.size();i++) {
			
			if(players.get(i).getPlayerId()==id) {
				players.set(i, updated);
				return "updated successfully";
			}
		}
		
		return null;
	
	}
   
}
