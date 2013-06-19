package com.maximustinov.seabattle.basic;

import java.util.Map;
import java.util.Set;

import com.maximustinov.seabattle.Field;
import com.maximustinov.seabattle.Game;
import com.maximustinov.seabattle.Player;
import com.maximustinov.seabattle.Ship.Direction;

public class GameImpl implements Game {
	private Set<Player> players;
	private Map<Player, Field> fields;
	
	@Override
	public void init(String[] players, int fieldWidth, int fieldHeight) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addShip(String player, int size, int coordinate,
			Direction direction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hit(String player, int cellNumber, int bulletSize) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getState() {
		// TODO Auto-generated method stub
		return null;
	}

}
