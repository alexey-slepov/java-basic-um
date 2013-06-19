package com.maximustinov.seabattle.basic;

import java.util.HashSet;
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
	public boolean init(String[] players, int fieldWidth, int fieldHeight) {
		if(players == null || players.length < 2 || fieldWidth < 1 || fieldHeight < 1){
			return false;
		}
		for(int i=0; i < players.length - 1; i++){
			for(int j=i+1; j < players.length; j++){
				if(players[i].equalsIgnoreCase(players[j])){
					return false;
				}
			}
		}
		initPlayers(players);
		initFields(fieldWidth, fieldHeight);
		
		return true;
	}
	
	private void initPlayers(String[] names){
		players = new HashSet<Player>();
		for(String name: names){
			players.add(new PlayerImpl(name));
		}
	}
	
	private void initFields(int width, int height){
		for(Player player: players){
			fields.put(player, new FieldImpl(width, height));
		}
	}

	@Override
	public void addShip(String player, int size, int coordinate,
			Direction direction) {
		if(player == null || player.length() == 0 || size < 1 || coordinate < 0 || direction == null){
			return;
		}
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
