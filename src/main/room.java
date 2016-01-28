package main;

import java.awt.Graphics;

import javax.swing.JPanel;

public class room extends JPanel{// implements Runnable{
	//Thread thread = new Thread(this);
	
	public tile[][] room;
	public String[][] rooms = {{"0111111110","0122222210","0122222210","0122222210","0122222210","0122222210","0111111110"}};

	private boolean first;
	
	public room(int shape){
		room = new tile[rooms[shape][0].length()][rooms[shape].length];
		for(int y = 0; y < rooms[shape].length; y++){
			for(int x = 0; x < rooms[shape][y].length(); x++){
				System.out.println(rooms[shape][y].charAt(x));
				room[x][y] = new tile(Character.getNumericValue(rooms[shape][y].charAt(x)),x*80,y*80);
			}
		}
	}	
	
	@Override
	public void paintComponent(Graphics g){
		
		for(tile[] row : room){
			for(tile Tile : row){
				Tile.draw(g, 0);
			}
		}
		Window.Player.draw(g, 0);
	}

	private void define() {
		// TODO Auto-generated method stub
		
	}
}
