package ajbinky;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Pxl extends JPanel {

	private static final long serialVersionUID = -8134472978132598224L;
	int myX;
	int myY;
	Color bg;
	public Pxl(int inx, int iny, Color inbg) {
		myX = inx;
		myY = iny;
		bg = inbg;
	}
	
	public void setColor(Color inbg) {
		// TODO
		bg = inbg;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(bg);
		g2.fill(new Rectangle2D.Double(myX,myY,32,32));
	}
	
}