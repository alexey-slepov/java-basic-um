package com.maximustinov.seabattle.basic;

import com.maximustinov.seabattle.Player;

public class PlayerImpl implements Player {
	private String name;
	
	public PlayerImpl(String name) {
		this.name = name;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return super.hashCode() + 31 + name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Player)){
			return false;
		}
		Player another = (Player)obj;
		return name.equals(another.getName());
	}
	
	

}
