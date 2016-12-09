import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleCalculator implements ActionListener {
	public static void main(String[] args) {
		SimpleCalculator calculate = new SimpleCalculator();
		calculate.addition();

	}

	JButton addition = new JButton("Add");
	JButton subtraction = new JButton("Subtract");
	JButton multiplication = new JButton("Multiply");
	JButton division = new JButton("Divide");
	JTextField first = new JTextField();
	JTextField second = new JTextField();
	JLabel answer = new JLabel();

	public void addition() {
		Dimension text = new Dimension(150, 30);
		JFrame calculator = new JFrame();
		JPanel panel = new JPanel(new FlowLayout());

		calculator.add(panel);
		panel.add(first);
		panel.add(second);
		panel.add(addition);
		panel.add(subtraction);
		panel.add(multiplication);
		panel.add(division);
		panel.add(answer);
		first.setPreferredSize(text);
		second.setPreferredSize(text);
		calculator.setVisible(true);
		calculator.setSize(375, 500);
		addition.addActionListener(this);
		subtraction.addActionListener(this);
		multiplication.addActionListener(this);
		division.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(addition)) {
			String firstnumber = first.getText();
			String secondnumber = second.getText();
			int firstnum = Integer.parseInt(firstnumber);
			int secondnum = Integer.parseInt(secondnumber);
			int additionanswer = firstnum + secondnum;
			answer.setText(additionanswer + "");
			answer.setFont(new Font("Arial", Font.BOLD, 50));

		}
		if (e.getSource().equals(subtraction)) {
			String firstnumber = first.getText();
			String secondnumber = second.getText();
			int firstnum = Integer.parseInt(firstnumber);
			int secondnum = Integer.parseInt(secondnumber);
			int subtractionanswer = firstnum - secondnum;
			answer.setText(subtractionanswer + "");
		}
		if (e.getSource().equals(multiplication)) {
			String firstnumber = first.getText();
			String secondnumber = second.getText();
			int firstnum = Integer.parseInt(firstnumber);
			int secondnum = Integer.parseInt(secondnumber);
			int multiplicationanswer = firstnum * secondnum;
			answer.setText(multiplicationanswer + "");
		}
		if (e.getSource().equals(division)) {
			String firstnumber = first.getText();
			String secondnumber = second.getText();
			int firstnum = Integer.parseInt(firstnumber);
			int secondnum = Integer.parseInt(secondnumber);
			int divisionanswer = firstnum / secondnum;
			answer.setText(divisionanswer + "");
		}

	}

}
