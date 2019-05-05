import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InputContainer extends JFrame {

	JButton submitButton = new JButton("Submit");
	
	String fromText = "";
	JTextField from = new JTextField(fromText, 1);
	
	String toText = "";
	JTextField to = new JTextField(toText, 1);
	InputSubmitAction listener;
	
	InputContainer(InputSubmitAction listener){
		this.listener = listener;
	}
	
	public void draw(JPanel masterContainer) {
		JPanel inputContainer = new JPanel(new GridLayout(1, 3));
		masterContainer.add(inputContainer);

	
		Font bigFont = from.getFont().deriveFont(Font.PLAIN, 120f);
		from.setFont(bigFont);
		inputContainer.add(from);

	
		to.setFont(bigFont);
		inputContainer.add(to);

		submitButton.setFont(bigFont);
		inputContainer.add(submitButton);
		this.onSubmit();
	}

	public void onSubmit() {
		submitButton.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
				  String fromText = from.getText();
				  double fromNum = Double.parseDouble(fromText);
				  
				  String toText = to.getText();
				  double toNum = Double.parseDouble(toText);
				  
				  JOptionPane.showMessageDialog(null, "From Tower = " + fromNum + " To Tower = " + toNum );
				  listener.onSubmit(2,3);
				  
			  } 
			} );
	}

}
