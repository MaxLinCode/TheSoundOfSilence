package com.soundofsilence.entities;

public abstract class Entity {
	public int x = 0;
	public int y = 0;
	
	protected int width;
	protected int height;
	
	public Entity() {
		
	}
	
	public Entity(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void translate(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	public int getWidth() { return width; }
	
	public int getHeight() { return height; }

	
}
