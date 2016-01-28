package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Player extends Rectangle	{
	double xDouble;
	double yDouble;
	
	IsKeyPressed k = new IsKeyPressed();
	
	public Player(){
		super(400,300,40,40);
		xDouble = 400;
		yDouble = 300;
		
	}	
	
	
	public void move(double speed, double angle){
		xDouble = xDouble + Math.cos(angle)*speed;
		yDouble = yDouble - Math.sin(angle)*speed;
		
		x = (int)xDouble;
		y = (int)yDouble;
		
	}
	
	public void act(){
		double angle = 0;
		int movementButtons = 0;
		if(k.isPressing('a')){
			angle = angle + Math.PI;
			movementButtons++;
		}
		if(k.isPressing('s')){
			angle = angle - Math.PI/2;
			movementButtons++;
		}
		if(k.isPressing('d')){
			movementButtons++;
		}
		if(k.isPressing('w')){
			angle = angle + Math.PI/2;
			movementButtons++;
		}
		if(movementButtons>0){
			move(10,angle/movementButtons);
		}
	}
	
	public void draw(Graphics g, int offset){
		g.setColor(Color.RED);
			
		g.fillRect(x - offset, y, width, height);
		
	}
}
