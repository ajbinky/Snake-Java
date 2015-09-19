package ajbinky;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class Pxl extends JPanel {

	private static final long serialVersionUID = -8134472978132598224L;
	private int x;
	private int y;
	
	public Pxl(int inx, int iny) {
		x = inx;
		y = iny;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		g2.setPaint(Color.BLACK);
		g2.fill(new Rectangle2D.Double(x,y,32,32));
	}
	
}