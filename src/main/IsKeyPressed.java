package main;

import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class IsKeyPressed {
	ArrayList<Character> keys = new ArrayList<Character>();
	
    public boolean isPressing(char key) {
        synchronized (IsKeyPressed.class) {
        	return keys.contains(key);
        }
    }

    public IsKeyPressed(){
    	
        KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(new KeyEventDispatcher() {

            @Override
            public boolean dispatchKeyEvent(KeyEvent ke) {
                synchronized (IsKeyPressed.class) {
                    switch (ke.getID()) {
                    case KeyEvent.KEY_PRESSED:
                        keys.add(ke.getKeyChar());
                        break;

                    case KeyEvent.KEY_RELEASED:
                    	System.out.println(ke.getKeyChar());
                    	int i = 0;
                    	char k = ke.getKeyChar();
                    	while(keys.indexOf(ke.getKeyChar()) != -1){
                    		keys.remove(k);
                    	}
                        break;
                    }
                    return false;
                }
            }
        });
        
    }
}
