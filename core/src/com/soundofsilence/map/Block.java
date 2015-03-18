package com.soundofsilence.map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Block {
	private int blockType;
	private int x,y;
	private int width, height;
	private Texture texture;
	
	public Block(int blockType, int x, int y, int width, int height) {
		this.blockType = blockType;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		texture = new Texture("red_brick.jpg");
	}
	//requires a type, location, and size(width, height)
	
	public void draw(SpriteBatch batch) {
		batch.begin();
		batch.draw(texture, x, y, width, height);
		batch.end();
	}
}