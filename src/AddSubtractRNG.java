import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AddSubtractRNG implements ActionListener {
	Dimension frameDimension = new Dimension(1000, 1000);
	int randomNum = new Random().nextInt(100);
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton add = new JButton();
	JButton subtract = new JButton();
	JButton reset = new JButton();
	JLabel number = new JLabel();

	public static void main(String[] args) {
		AddSubtractRNG magicBox = new AddSubtractRNG();
		magicBox.setUI();
	}

	public void setUI() {
		frame.add(panel);
		panel.add(add);
		panel.add(subtract);
		panel.add(reset);
		panel.add(number);
		frame.setPreferredSize(frameDimension);
		frame.setVisible(true);
		add.setText("Add");
		subtract.setText("Subtract");
		reset.setText("New Random Number");
		number.setText(""+randomNum);
		add.addActionListener(this);
		subtract.addActionListener(this);
		reset.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(add)) {
			randomNum++;
			number.setText(""+randomNum);
		}
		if (e.getSource().equals(subtract)) {
			randomNum--;
			number.setText(""+randomNum);
		}
		if (e.getSource().equals(reset)) {
			randomNum = new Random().nextInt(100);
			number.setText(""+randomNum);
		}
	}

}
