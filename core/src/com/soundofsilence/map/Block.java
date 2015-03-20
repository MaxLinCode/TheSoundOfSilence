package com.soundofsilence.map;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Block {
	private int blockType;
	private int x,y;
	private int width, height;
	private Texture texture;
	private int texh, texw;
	
	public Block(int blockType, int x, int y, int width, int height) {
		this.blockType = blockType;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;

		/*
		 * MAKE SURE TO CHANGE THE TEXTURE TO REFLECT BLOCKTYPE
		 * ALSO MAKE THE TEXTURE NOT STRETCH OVER THE RECTANGLE
		 * 
		 * possibly add the rectangle generation for the collision map
		 */
		texture = new Texture("textures/red_brick_64.jpg");
		texw = texture.getWidth();
		texh = texture.getHeight();
	}
	//requires a type, location, and size(width, height)
	
	public void draw(SpriteBatch batch) {
		batch.begin();
		// loop to draw like tiles
		System.out.println(y + "  " + (y + texh) + " " + height);
		for(int vert = y; vert + texh <=  height + y; vert += texh) {
			for(int hori = x; hori + texw <= width + x; hori += texw) {
				batch.draw(texture, hori, vert, texw, texh);
				
				if(vert + texh * 2 > height + y && hori + texw * 2 > width + x) {
					TextureRegion temp = new TextureRegion(texture, width % texw, height % texh);
					temp.flip(true, true);
					batch.draw(temp, hori + texw, vert + texh, temp.getRegionWidth(), temp.getRegionHeight());
				}
				
				if(vert + texh * 2 > height + y) {
					TextureRegion temp = new TextureRegion(texture, texw, height % texh);
					temp.flip(false, true);
					batch.draw(temp, hori, vert + texh, temp.getRegionWidth(), temp.getRegionHeight());
				}
				
				if(hori + texw * 2 > width + x) {
					TextureRegion temp = new TextureRegion(texture, width % texw, texh);
					System.out.println(temp.getRegionWidth());
					temp.flip(true, false);
					batch.draw(temp, hori + texw, vert, temp.getRegionWidth(), temp.getRegionHeight());
				}
			}
		}
		
		
		batch.end();
	}
}
