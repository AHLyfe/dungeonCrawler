package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class player extends Rectangle{
	
	public player(){
		super(400,300,20,20);
		
	}	
	public void draw(Graphics g, int offset){
		
		g.setColor(Color.RED);
		
		
		g.fillRect(x - offset, y, width, height);
		
	}
}
