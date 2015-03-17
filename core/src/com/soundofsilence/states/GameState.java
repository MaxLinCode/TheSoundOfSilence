package com.soundofsilence.states;

import com.soundofsilence.game.GameStateManager;


public abstract class GameState {
	
	protected GameStateManager gsm;
	
	protected GameState(GameStateManager gsm) {
		this.gsm = gsm;
		init();
	}
	
	public abstract void init();	 
	public abstract void update(float dt);
	public abstract void draw();
	public abstract void dispose();
	
}
