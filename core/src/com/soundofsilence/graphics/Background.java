package com.soundofsilence.graphics;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Background {
	
	private Texture tex;
	private int x, y;

	public Background(String path) {
		tex = new Texture(path);
		x = 0;
		y = 0;
	}
	
	public void draw(SpriteBatch batch) {
		batch.begin();
		batch.draw(tex, x, y, Gdx.graphics.getWidth(), tex.getHeight());
		batch.end();
	}
	
	public void translate(int x, int y) {
		this.x += x;
		this.y += y;
	}
	
	public void setX(int x) {
		this.x = x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	
	public void setBackground(String path) {
		tex = new Texture(path);
	}
}
