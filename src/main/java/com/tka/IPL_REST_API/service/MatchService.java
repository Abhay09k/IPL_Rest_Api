package com.tka.IPL_REST_API.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tka.IPL_REST_API.dao.MatchDao;
import com.tka.IPL_REST_API.model.Matches;

@Service
public class MatchService {

	@Autowired
	private MatchDao matchDao;

	public String addNewMatch(Matches matches) {

		String msg = matchDao.addNewMatch(matches);

		return msg;

	}

	public List<Matches> viewAllMatches() {

		List<Matches> matches = matchDao.viewAllMatches();

		return matches;
	}

	public Matches getMatchById(int id) {

		Matches match = matchDao.getMatchById(id);

		return match;

	}

	public String deleteMatchById(int id) {

		String msg = matchDao.deleteMatchById(id);
		
		return msg;

	}

	 public String updateMatchById(int id,Matches updated) {
			
	    	String msg = matchDao.updateMatchById(id, updated);
	    	
	    	
	    	
	    	return msg;	
	    	
	    }

}
