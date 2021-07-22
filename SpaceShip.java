import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.*;

public class SpaceShip {
	private int dimx, dimy;
	private boolean isShooting;
	private final int myWidth = 40, myHeight = 20;
	
	public void movement(int xPos, int yPos) {
		dimx = xPos;
		dimy = yPos;
	}
	
	public void setShooting(boolean val) {
		isShooting = val;
	}
	
	public void drawShuttle(Graphics g, int screenWidth) {
		int baseX = dimx - myWidth;
		int baseY = dimy - myHeight/2;
		g.setColor(Color.blue);
		g.drawLine(baseX + 10, baseY - 10, baseX + myWidth/2, dimy + myHeight/2);
		g.drawLine(baseX + myWidth/2, dimy + myHeight/2, dimx - 10, baseY - 10);
		g.setColor(Color.pink);
		g.fillArc(baseX, baseY, myWidth, myHeight, 0, 180);
		
		g.setColor(Color.gray);
		for(int i = 0; i < 4; i++) {
			g.fillOval(baseX + (i + 1) * 7, baseY + 8, 6, 6);
		}
		
		if(isShooting) {
			g.setColor(Color.white);
			g.drawLine(dimx, dimy, screenWidth, dimy);
		}
	}
}
