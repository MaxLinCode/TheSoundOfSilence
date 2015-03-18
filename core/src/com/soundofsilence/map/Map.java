package com.soundofsilence.map;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Map {
	private ArrayList<Block> blocks = new ArrayList<Block>();
	private Scanner scan;

	public Map() {
		try { 
			scan = new Scanner(new File("$DIR/assets/BlockMap.txt"));
		} 
		catch(Exception e) { 
			e.printStackTrace(); 
		}
		
		String line = "";
		String[] values = new String[5];
		for(int i = 0; ;i++ ) {
			try { 
				line = scan.nextLine();
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
