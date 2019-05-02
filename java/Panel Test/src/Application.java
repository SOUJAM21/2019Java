import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Application {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setTitle("");
		frame.setSize(1500, 1500);

		JPanel masterContainer = new JPanel(new GridLayout(2, 1));

		
		
		TowerContainer towercon = new TowerContainer();
		towercon.draw(masterContainer);
		
		
		
		InputContainer inputcon = new InputContainer();
		inputcon.draw(masterContainer);

		
		
		
		
		frame.add(masterContainer);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
