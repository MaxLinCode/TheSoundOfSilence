package com.soundofsilence.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

public class Game implements ApplicationListener {
	public static int SCREEN_WIDTH, SCREEN_HEIGHT;
	
	GameStateManager gsm;
	
	@Override
	public void create () {
		SCREEN_WIDTH = Gdx.graphics.getHeight();
		SCREEN_HEIGHT = Gdx.graphics.getHeight();
		
		gsm = new GameStateManager();
	}

	@Override
	public void render () {
		// clear screen
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		//update
		gsm.update(Gdx.graphics.getDeltaTime());
		
		//draw
		gsm.draw();
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}

	@Override
	public void dispose() {
	}
}
