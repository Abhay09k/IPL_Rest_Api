package com.tka.IPL_REST_API.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.IPL_REST_API.dao.TeamDao;
import com.tka.IPL_REST_API.model.Team;

@Service
public class TeamService {

	@Autowired
	private TeamDao teamDao;
	
	public Object addTeam(Team team) {
		
		Object Team = teamDao.addTeam(team);
		
		return Team;
	}
	
   public List<Team> viewAllTeams(){
	
	   List<Team> Teams = teamDao.viewAllTeams();
	   
	   return Teams;
	
	
    }
	
   public Team getTeamById( int id) {
		
	   Team team = teamDao.getTeamById(id);
	   
	   return team; 	   
	   
   }
   
   
	public String deleteTeamById( int id) {
		
		String msg = teamDao.deleteTeamById(id);
		
		return msg;
		
	}
   
	 public String updateTeamById(int id,Team updated) {
	
        String msg = teamDao.updateTeamById(id, updated);		
		
        return msg;
		
	 }
	 
}
