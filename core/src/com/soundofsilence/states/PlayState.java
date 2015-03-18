package com.soundofsilence.states;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.soundofsilence.entities.Player;
import com.soundofsilence.game.Game;
import com.soundofsilence.game.GameStateManager;
import com.soundofsilence.graphics.Background;
import com.soundofsilence.map.Map;

public class PlayState extends GameState {
	
	private SpriteBatch batch;
	private Background backgd;
	private OrthographicCamera cam;
	
	private Map map;
	private Player player;
	
	public PlayState(GameStateManager gsm) {
		super(gsm);
	}

	public void init() {
		batch = new SpriteBatch();
		backgd = new Background("background.jpg");
		backgd.translate(0, Gdx.graphics.getHeight()/4);
		cam = new OrthographicCamera(Game.SCREEN_WIDTH, Game.SCREEN_HEIGHT);
		cam.setToOrtho(false);
		cam.update();
		
		player = new Player(0, 0, 256, 256);
		map = new Map();
	}

	public void update(float dt) {
		float speed = 500.0f * dt;
		if(Gdx.input.isKeyPressed(Keys.W)) {
			player.y += speed;
		}
		if(Gdx.input.isKeyPressed(Keys.A)) { 
			player.x -= speed;
		}
		if(Gdx.input.isKeyPressed(Keys.S)) {
			player.y -= speed;
		}
		if(Gdx.input.isKeyPressed(Keys.D)) {
			player.x += speed;
		}
	}

	public void draw() {
		batch.setProjectionMatrix(cam.combined);
		backgd.draw(batch);
		map.draw(batch);
		player.draw(batch);
	}

	public void dispose() {

	}

}
