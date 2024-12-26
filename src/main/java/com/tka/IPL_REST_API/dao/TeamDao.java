package com.tka.IPL_REST_API.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.tka.IPL_REST_API.model.Team;

@Repository
public class TeamDao {

	List<Team> teams = new ArrayList<Team>();

	public TeamDao() {

		teams.add(new Team(1, "RCB", "Banglore", "Virat "));
		teams.add(new Team(2, "MI", "Mumbai", "Sachin"));

	}

	public String addTeam(Team team) {

		teams.add(team);

		return "Added Successfully";

	}

	public List<Team> viewAllTeams() {

		return teams;

	}

	public Team getTeamById(int id) {

		for (Team team : teams) {

			if (team.getTeamId() == id) {
				return team;
			}
		}

		return null;

	}

	public String deleteTeamById(int id) {

		for (Team team : teams) {

			if (team.getTeamId() == id) {

				teams.remove(team);

				return "deleted successfully";

			}

		}

		return null;

	}

//	  public String updateTeamById(int id, Team updated) {	
//			
//		  for (Team team : teams) {
//			
//			  if(team.getTeamId()==id) {
//				  			  
//				  teams.remove(team);
//				  teams.add(updated);
//				
//				  
//				  return "updated successfully";
//				  
//			  }
//		}
//			
//			return "not found";
//		}
	public String updateTeamById(int id, Team updated) {

		for (int i = 0; i < teams.size(); i++) {

			if (teams.get(i).getTeamId() == id) {
				
				// Replace the team at the current position
				
				teams.set(i, updated);
				
				return "updated successfully";
			}
		}
		
		return "not found";
	}

}
