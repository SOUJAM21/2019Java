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

		
		
		
		JPanel towerContainer = new JPanel(new GridLayout(1, 3));
		masterContainer.add(towerContainer);

		Tower tower1 = new Tower();
		Disc disc = new Disc(Color.black, 300);
		Disc disc1 = new Disc(Color.blue, 200);
		Disc disc2 = new Disc(Color.green, 100);
		tower1.addDisc(disc);
		tower1.addDisc(disc1);
		tower1.addDisc(disc2);
		tower1.setPreferredSize(new Dimension(100, 100));
		towerContainer.add(tower1);

		Tower tower2 = new Tower();
		tower2.setPreferredSize(new Dimension(100, 100));
		towerContainer.add(tower2);

		Tower tower3 = new Tower();
		tower3.setPreferredSize(new Dimension(100, 100));
		towerContainer.add(tower3);

		
		
		
		
		JPanel inputContainer = new JPanel(new GridLayout(1, 3));
		masterContainer.add(inputContainer);

		String fromText = "From";
		JTextField from = new JTextField(fromText, 1);
		Font bigFont = from.getFont().deriveFont(Font.PLAIN, 120f);
		from.setFont(bigFont);
		inputContainer.add(from);

		String toText = "To";
		JTextField to = new JTextField(toText, 1);
		to.setFont(bigFont);
		inputContainer.add(to);

		JButton submitButton = new JButton("Submit");
		submitButton.setFont(bigFont);
		inputContainer.add(submitButton);

		
		
		
		
		frame.add(masterContainer);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}
