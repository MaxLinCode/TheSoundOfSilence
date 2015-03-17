package com.soundofsilence.entities;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Player extends Entity {
	private int maxLife = 3;
	private int life = 3;
	private Texture tex = new Texture("Nyewall.com-download-the-legend-of-zelda-skyward-sword-hd-wallpapers-full-original.jpg");								
	
	public Player() {
		
	}

	public Player(int x, int y, int width, int height) {
		super(x, y, width, height);
	}
	
	public void draw(SpriteBatch batch) {
		batch.begin();
		batch.draw(tex, x, y, width, height);
		batch.end();
	}
	
	public int getMaxLife() {
		return maxLife;
	}

	public int getLife() {
		return life;
	}

	public void setMaxLife(int maxLife) {
		this.maxLife = maxLife;
	}

	public void setLife(int life) {
		this.life = life;
	}
}
