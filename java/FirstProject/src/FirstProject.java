import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FirstProject {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 1000);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel p = new JPanel();
		p.setBackground(Color.GRAY);
		f.add(p);

		JButton b = new JButton();
		b.setText("1");
		b.setPreferredSize(new Dimension(300,100));
		p.add(b);
		f.setVisible(true);
	}

}