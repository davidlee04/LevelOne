import java.awt.Dimension;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HiddenWord implements ActionListener {
	Dimension answerDimensions = new Dimension(500, 50);
	String result = "";
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	JButton button4 = new JButton();
	JButton submit = new JButton();
	JTextField answer = new JTextField();
	JLabel end = new JLabel();
	JButton[] JButtonArray = new JButton[4];

	public static void main(String[] args) {
		HiddenWord game = new HiddenWord();
		game.addComponents();
		game.setProperties();
		game.setArray();
		game.setActionListeners();
	}

	public void addComponents() {
		frame.add(panel);
		panel.add(answer);
		panel.add(submit);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(end);
	}

	public void setArray() {
		JButtonArray[0]=(button1);
		JButtonArray[1]=(button2);
		JButtonArray[2]=(button3);
		JButtonArray[3]=(button4);
	}

	public void setProperties() {
		frame.setVisible(true);
		frame.setSize(500, 500);
		answer.setEditable(false);
		submit.setText("SUBMIT");
		answer.setPreferredSize(answerDimensions);
		button1.setText("E");
		button2.setText("J");
		button3.setText("I");
		button4.setText("D");
	}

	public void setActionListeners() {
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		submit.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(submit)) {
			if (result.equalsIgnoreCase("JEDI")) {
				end.setText("Correct!");
			} else {
				end.setText("Incorrect");
				answer.setText("");
				/*for (int i = 0; i <= 4; i++) {
					JButtonArray[i].show(true);
				}*/
				button1.show(true);
				button2.show(true);
				button3.show(true);
				button4.show(true);
				
			}
		} else if (e.getSource() instanceof JButton) {
			((JButton) e.getSource()).show(false);
			result += ((JButton) e.getSource()).getText();
			answer.setText(result);
		}

	}

}
