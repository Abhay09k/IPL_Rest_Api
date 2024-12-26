package com.tka.IPL_REST_API.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import com.tka.IPL_REST_API.model.Matches;

@Repository
public class MatchDao {

	List<Matches> matchess = new ArrayList<Matches>();
	
	public MatchDao() {
	
		matchess.add(new Matches(1, "Mumbai", "Chennai", "26-12-2024", "Wankhede", "Mumbai Won"));
		matchess.add(new Matches(2, "KKR", "RCB", "27-12-2024", "NM Stadium", "KKR Won"));
	
	}
	
	
 public String addNewMatch(Matches matches) {
		
		matchess.add(matches);
		
		return "match added Successfully";
		
		
	}

	public List<Matches> viewAllMatches() {
		
		
		
		return matchess;	
	}

   public Matches getMatchById(int id) {
	
	   for (Matches matches : matchess) {
		
		   if(matches.getMatchId()==id) {
			   
			   return matches;
		   }
		   
	}
	   
	   
	   return null;
	   
   }


    public String deleteMatchById(int id) { 
    	
    	for (Matches matches : matchess) {
			
    		if(matches.getMatchId()==id) {
    			matchess.remove(matches);
    			return "deleted successfully";
    		}
		}
		return "match not found";
    	
    }

    public String updateMatchById(int id,Matches updated) {
		
    	for(int i =0;i<matchess.size();i++) {
    		if(matchess.get(i).getMatchId()==id) {
    			
    			matchess.set(i, updated);
    		
    			return "updated successfully";
    		}
    	}
    	
    		return "not found";	
    }
    
}
