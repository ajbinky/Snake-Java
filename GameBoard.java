package ajbinky;

import java.awt.Color;

import javax.swing.JFrame;

public class GameBoard extends JFrame {

	private static final long serialVersionUID = 1L;
	private final int pxlSize = 32;
	//min value of 16 - idk max yet
	private int boardMod = 16;
	private int boardSize = pxlSize * boardMod;
	

	
	
	public GameBoard() {
		
		add(new Pxl(256,256));
		
		setTitle("Snake.apk");
		setSize(boardSize, boardSize);
		getContentPane().setBackground(Color.BLACK);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public int getBoardSize() {
		return boardMod;
	}
	
}
