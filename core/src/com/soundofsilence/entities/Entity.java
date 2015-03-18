package com.soundofsilence.entities;

public abstract class Entity {
	public float x = 0;
	public float y = 0;
	
	protected int width;
	protected int height;
	
	public Entity() {
		
	}
	
	public Entity(float x, float y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	public void translate(float x, float y) {
		this.x += x;
		this.y += y;
	}
	
	public int getWidth() { return width; }
	
	public int getHeight() { return height; }

	
}
