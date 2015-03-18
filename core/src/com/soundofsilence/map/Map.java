package com.soundofsilence.map;


import java.io.BufferedReader;
import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Map {
	private ArrayList<Block> blocks = new ArrayList<Block>();
	private FileHandle file = Gdx.files.internal("maps/BlockMap.txt");
	private BufferedReader read;

	public Map() {
		try { 
			read = new BufferedReader(file.reader());
		} 
		catch(Exception e) { 
			e.printStackTrace(); 
		}
		
		String line = "";
		String[] values = new String[5];
		for(int i = 0; ;i++) {
			try { 
				line = read.readLine();
				if(line == null) break;
			} 
			catch(Exception e) { 
				e.printStackTrace(); 
			}
			values = line.split(" ");
				blocks.add(new Block(Integer.parseInt(values[0]), Integer.parseInt(values[1]), Integer.parseInt(values[2]), Integer.parseInt(values[3]), Integer.parseInt(values[4])));
			
		}
	}
	
	public void draw(SpriteBatch batch) {
		for(int i = 0; i < blocks.size(); i++) {
			blocks.get(i).draw(batch);
		}
	}
}
