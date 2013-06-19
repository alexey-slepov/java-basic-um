package com.maximustinov.seabattle;

public interface Ship {
	public enum Direction { horizontal, vertical };
	
	public void init(int size, Direction direction);
	
	public int getSize();
	
	public Direction getDirection();
	
}
