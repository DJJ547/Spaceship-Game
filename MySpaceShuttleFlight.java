import javax.swing.JFrame;

public class MySpaceShuttleFlight {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Spaceship Flight");
		frame.getContentPane().add(new SpaceShuttlePanel());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setResizable(false);
		frame.setVisible(true);
	}
}
