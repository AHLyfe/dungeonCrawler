package main;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class player extends Rectangle implements KeyListener{
	
	public player(){
		super(400,300,20,20);
		
	}
	public void keyPressed(KeyEvent e) {
		//this does literally nothing coz im dumb
		if(e.getKeyCode() == KeyEvent.VK_LEFT){
				x = x+1;
			}
			else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
				x = x-1;
			}
			else if(e.getKeyCode() == KeyEvent.VK_UP){
				y = y-1;
			}
			else if(e.getKeyCode() == KeyEvent.VK_DOWN){
				y = y+1;
			}
		}

	public void keyReleased(KeyEvent e) {
		/*if(e.getKeyCode() == KeyEvent.VK_LEFT){
			player.isLeft = false;
		}
		else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
			player.isRight = false;
		}
		else if(e.getKeyCode() == KeyEvent.VK_UP || e.getKeyCode() == KeyEvent.VK_SPACE){
			player.isUp = false;
		}	*/
		
	}

	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	public void draw(Graphics g, int offset){
		
		g.setColor(Color.RED);
		
		
		g.fillRect(x - offset, y, width, height);
		
	}
}
