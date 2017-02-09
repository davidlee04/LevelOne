import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SlotMachine implements ActionListener {
	int[] randomNums = new int[3];
	int cash = 500;
	int betAmt = 0;
	Dimension slotNumbers = new Dimension(30, 20);
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton roll = new JButton();
	JLabel currentCash = new JLabel();
	JTextField firstRoll = new JTextField();
	JTextField secondRoll = new JTextField();
	JTextField thirdRoll = new JTextField();

	public int askBet() {
		String bet = JOptionPane.showInputDialog("How much money do you want to bet?");
		betAmt = Integer.parseInt(bet);
		return betAmt;
	}

	public void setUI() {
		frame.add(panel);
		panel.add(firstRoll);
		panel.add(secondRoll);
		panel.add(thirdRoll);
		panel.add(roll);
		panel.add(currentCash);
		frame.pack();
		frame.setVisible(true);
		frame.setSize(500, 500);
		roll.setText("Roll");
		currentCash.setText("$" + cash);
		roll.addActionListener(this);
		firstRoll.setEditable(false);
		secondRoll.setEditable(false);
		thirdRoll.setEditable(false);
		firstRoll.setPreferredSize(slotNumbers);
		secondRoll.setPreferredSize(slotNumbers);
		thirdRoll.setPreferredSize(slotNumbers);
	}

	public int[] generateRandomNums() {
		int firstNum = new Random().nextInt(2);
		int secondNum = new Random().nextInt(2);
		int thirdNum = new Random().nextInt(2);
		randomNums[0] = firstNum;
		randomNums[1] = secondNum;
		randomNums[2] = thirdNum;
		return randomNums;
	}

	/*public int addCash() {
		if (checkNums() == 2) {
			int reward = (int) (betAmt * 0.5);
			cash = cash + reward;
			JOptionPane.showMessageDialog(null, "Your balance has been increased by 0.5 of your bet!");
			currentCash.setText("$" + cash);
			return cash;
		} else if (checkNums() == 3) {
			int reward = (int) (betAmt * 2);
			cash = cash + reward;
			currentCash.setText("$" + cash);
			JOptionPane.showMessageDialog(null, "Your balance has been increased double your bet!");
			return cash;
		} else if (checkNums() == 1) {
			JOptionPane.showMessageDialog(null, "Your balance has been increased by nothing :(");
			return cash;
		} else {
			return cash;
		}
	}          failure... addCash code added to checkNums method                   */

	public int checkNums() {
		if (randomNums[1] == randomNums[0] && randomNums[2] != randomNums[1] && randomNums[2] != randomNums[0]) {
			int reward = (int) (betAmt * 0.5);
			cash = cash + reward;
			JOptionPane.showMessageDialog(null, "Your balance has been increased by 0.5 of your bet!");
			currentCash.setText("$" + cash);
			firstRoll.setText("");
			secondRoll.setText("");
			thirdRoll.setText("");
			generateRandomNums();
			return cash;
		} else if (randomNums[2] == randomNums[1] && randomNums[2] != randomNums[0] && randomNums[1] != randomNums[0]) {
			int reward = (int) (betAmt * 0.5);
			cash = cash + reward;
			JOptionPane.showMessageDialog(null, "Your balance has been increased by 0.5 of your bet!");
			currentCash.setText("$" + cash);
			firstRoll.setText("");
			secondRoll.setText("");
			thirdRoll.setText("");
			generateRandomNums();
			return cash;
		} else if (randomNums[2] == randomNums[0] && randomNums[2] != randomNums[1] && randomNums[1] != randomNums[0]) {
			int reward = (int) (betAmt * 0.5);
			cash = cash + reward;
			JOptionPane.showMessageDialog(null, "Your balance has been increased by 0.5 of your bet!");
			currentCash.setText("$" + cash);
			firstRoll.setText("");
			secondRoll.setText("");
			thirdRoll.setText("");
			generateRandomNums();
			return cash;
		} else if (randomNums[0] == randomNums[1] && randomNums[1] == randomNums[2] && randomNums[0] == randomNums[2]) {
			int reward = (int) (betAmt * 2);
			cash = cash + reward;
			currentCash.setText("$" + cash);
			JOptionPane.showMessageDialog(null, "Your balance has been increased double your bet!");
			firstRoll.setText("");
			secondRoll.setText("");
			thirdRoll.setText("");
			generateRandomNums();
			return cash;
		} else {
			JOptionPane.showMessageDialog(null, "Your balance has been increased by nothing :(");
			firstRoll.setText("");
			secondRoll.setText("");
			thirdRoll.setText("");
			generateRandomNums();
			return cash;
		}
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(roll)) {
			firstRoll.setText(randomNums[0] + "");
			secondRoll.setText(randomNums[1] + "");
			thirdRoll.setText(randomNums[2] + "");
		}
		checkNums();
	}

}
