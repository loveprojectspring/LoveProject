package com.audrey.love.vue;

import com.audrey.love.entity.Lover;
import com.audrey.love.entity.Match;

public class Outils {

	public static Couple convertiLoverEtMatchEnCouple(Lover lover1,Lover lover2, Match match) {
		Couple couple = new Couple(Integer.toString(match.getId()),lover1.getName(),
				lover2.getName(),(int)Integer.getInteger(match.getPercentage()),match.getResult());
	
		return couple;
	}
	public static Lover recupereLover1DepuisCouple(Couple couple) {
		Lover lover1 = new Lover();
		lover1.setName(couple.getFirstPerson());
	
		return lover1;
	}
	public static Lover recupereLover2DepuisCouple(Couple couple) {
		Lover lover2 = new Lover();
		lover2.setName(couple.getSecondPerson());
	
		return lover2;
	}
	/**
	 * Pas encore fonctionnel
	 * @param couple
	 * @return
	 */
	public static Match recupereMatchDepuisCouple(Couple couple) {
		Match match = new Match();
		//match.setName(couple.getSecondPerson());
	
		return match;
	}
	
	
}
