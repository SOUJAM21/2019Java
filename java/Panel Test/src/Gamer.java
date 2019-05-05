import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Gamer implements InputSubmitAction{
	public void create() {
		JFrame frame = new JFrame();
		frame.setTitle("");
		frame.setSize(1500, 1500);

		JPanel masterContainer = new JPanel(new GridLayout(2, 1));

		TowerContainer towercon = new TowerContainer();
		towercon.create();
		masterContainer.add(towercon);

		InputContainer inputcon = new InputContainer(this);
		inputcon.draw(masterContainer);

		frame.add(masterContainer);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void onSubmit(int from, int to) {
		System.out.println("from: " + from + " to=" + to);
		
	}
}
