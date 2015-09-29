package ajbinky;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class GameBoard extends JFrame {

	private static final long serialVersionUID = 1L;
	private final int pxlSize = 32;
	//min value of 16 - idk max yet
	private int boardMod = 47;
	private int boardSize = pxlSize * boardMod;
	private int sleepTime = 100;
	private int locx = 2;
	private int locy = 2;
	private boolean left;
	private boolean up;
	private boolean right;
	private boolean down = true;
	Pxl[][] table;
	

	
	
	public GameBoard() {
		
		GridLayout grid = new GridLayout(boardMod, boardMod, 0, 0);
		
		setLayout(grid);
		table = new Pxl[boardMod][boardMod];
		
		for (int i = 0; i < boardMod; i++) {
			for (int j = 0; j < boardMod; j++) {
				Pxl p = new Pxl(0,0,Color.CYAN);
				add(p);
				table[i][j] = p;
			}
		}
		
		setTitle("Snake.apk " + boardMod + "x" + boardMod);
		setSize(boardSize, boardSize);
		setResizable(false);
		getContentPane().setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addKeyListener(new KeyListener(){
            @Override
               public void keyPressed(KeyEvent e) {
                   if(e.getKeyCode() == KeyEvent.VK_UP){
                	   resetBools();
                	   up = true;
                   } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                	   resetBools();
                	   left = true;
                   } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                	   resetBools();
                	   down = true;
                   } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                	   resetBools();
                	   right = true;
                   }
               }

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
       });
		
		
	}
	
	public void tick() {
		do {
			mySleep(sleepTime);
			if (left == true) {
				table[locx][locy--].setColor(Color.BLACK);
			} else if (right == true) {
				table[locx][locy++].setColor(Color.BLACK);
			} else if (down == true) {
				table[locx++][locy].setColor(Color.BLACK);
			} else if (up == true) {
				table[locx--][locy].setColor(Color.BLACK);
			}
			repaint();
		} while (true);
		
		
		
	}
	
	public void resetBools() {
    	up = false;
    	down = false;
    	right = false;
    	left = false;
    }
	
	public void mySleep(int i) {
		try {
		    	Thread.sleep(i);
			} catch(Exception e) {
		}
	}
	
	public void onCollision() {
		mySleep(3000);
	}
		
}
