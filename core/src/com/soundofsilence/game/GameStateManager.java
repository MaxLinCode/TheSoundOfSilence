package com.soundofsilence.game;

import com.soundofsilence.states.GameState;
import com.soundofsilence.states.PlayState;

public class GameStateManager {
	
	private GameState gamestate;
	
	public static final int MENU = 0;
	public static final int PLAY = 1;
	
	public GameStateManager() {
		setState(PLAY);
	}
	
	public void setState(int state) {
		if(gamestate != null) gamestate.dispose();
		
		if(state == MENU) {
			
		}
			
		if(state == PLAY) {
			gamestate = new PlayState(this);
		}
	}
	
	public void update(float dt) {
		gamestate.update(dt);
	}
	
	public void draw() {
		gamestate.draw();
	}
	
	
	
}
