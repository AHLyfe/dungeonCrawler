package main;

import java.awt.CardLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Window{
	public static JFrame frame;
	public static JPanel panel;
	public static final Dimension size = new Dimension(800,600);
	public static final String title = "Dungeon";

	public static Player player;
	
	
	public static void setComponent(Component component){
		panel.removeAll();
		panel.add(component);
		panel.validate();
	}
	
	public static void createFrame(){
		frame = new JFrame();
		
		frame.setSize(size);
		frame.setTitle(title);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setLayout(new GridLayout(1,1,0,0));
		
		
		//Repaint thread - should probably have a static thread that can stop and start but whatever
		new Thread(){
			public void run(){
				while(true){
					try {
						Thread.sleep(14);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(frame.getComponentCount() != 0){
						panel.repaint();
					}
				}
			}
		}.start();
		new Thread(){
			public void run(){
				while(true){
					try {
						Thread.sleep(14);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
					if(player != null){
						player.act();
					}
				}
			}
		}.start();
		panel = new JPanel(new CardLayout());
		frame.add(panel);
		
		setComponent(new Room(0));
		
		frame.setVisible(true);
		Room room = new Room(0);
		player = new Player();
	}
	
	public static void main(String[] args){
		createFrame();
	}
}
