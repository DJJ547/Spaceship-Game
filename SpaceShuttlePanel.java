import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class SpaceShuttlePanel extends JPanel{
	private static final long serialVersionUID = 1L;
	private SpaceShip myShip;
	public SpaceShuttlePanel() {
		myShip = new SpaceShip();
		SpaceshipListener myMonitor = new SpaceshipListener();
		addMouseMotionListener(myMonitor);
		addMouseListener(myMonitor);
		setCursor(Cursor.getPredefinedCursor(Cursor.CROSSHAIR_CURSOR));
		setBackground(Color.DARK_GRAY);
		setPreferredSize(new Dimension(600, 600));
	}
	
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		myShip.drawShuttle(page, getWidth());
	}
	
	private class SpaceshipListener implements MouseMotionListener, MouseListener{
		@Override
		public void mouseMoved(MouseEvent e) {
			myShip.movement(e.getX(), e.getY());
			repaint();
		}

		@Override
		public void mouseDragged(MouseEvent e) {
			myShip.movement(e.getX(), e.getY());
			repaint();
			
		}
		
		public void mousePressed(MouseEvent e) {
			myShip.setShooting(true);
			repaint();
		}
		
		public void mouseReleased(MouseEvent e) {
			myShip.setShooting(false);
			repaint();
		}
		
		public void mouseExited(MouseEvent e) {}
		public void mouseEntered(MouseEvent e) {}
		public void mouseClicked(MouseEvent e) {}
	}
}
