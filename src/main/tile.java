package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class tile extends Rectangle{
	
	public static final Color[] colours = {Color.BLACK,Color.DARK_GRAY,Color.GRAY};
	public int type;public tile(int type, int x, int y){
		super(x,y,80,80);
		this.type = type;
	}
	
	public void draw(Graphics g, int offset){
		
		g.setColor(colours[type]);
		
		
		g.fillRect(x - offset, y, width, height);
		
	}
}
