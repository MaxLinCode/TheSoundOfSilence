package com.soundofsilence.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.soundofsilence.game.Game;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "The Sound of Silence";
		config.width = 1000;
		config.height = 600;
		config.useGL30 = false;
		config.resizable = false;
		new LwjglApplication(new Game(), config);
	}
}
