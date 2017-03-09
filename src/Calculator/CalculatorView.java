package Calculator;

import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CalculatorView {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel firstDisplay = new JLabel();
	JLabel secondDisplay = new JLabel();
	JLabel thirdDisplay = new JLabel();
	JLabel fourthDisplay = new JLabel();
	JButton addition = new JButton();
	JButton subtraction = new JButton();
	JButton multiplication = new JButton();
	JButton division = new JButton();
	JButton zero = new JButton();
	JButton one = new JButton();
	JButton two = new JButton();
	JButton three = new JButton();
	JButton four = new JButton();
	JButton five = new JButton();
	JButton six = new JButton();
	JButton seven = new JButton();
	JButton eight = new JButton();
	JButton nine = new JButton();
	JButton clear = new JButton();
	JButton equals = new JButton();
	public CalculatorView(){
		setUI();
	}

	public void setUI() {
		frame.add(panel);
		panel.add(firstDisplay);
		panel.add(secondDisplay);
		panel.add(thirdDisplay);
		panel.add(fourthDisplay);
		panel.add(seven);
		panel.add(eight);
		panel.add(nine);
		panel.add(division);
		panel.add(four);
		panel.add(five);
		panel.add(six);
		panel.add(multiplication);
		panel.add(one);
		panel.add(two);
		panel.add(three);
		panel.add(subtraction);
		panel.add(clear);
		panel.add(zero);
		panel.add(equals);
		panel.add(addition);
		addition.setText("+");
		subtraction.setText("-");
		multiplication.setText("*");
		division.setText("÷");
		zero.setText("0");
		one.setText("1");
		two.setText("2");
		three.setText("3");
		four.setText("4");
		five.setText("5");
		six.setText("6");
		seven.setText("7");
		eight.setText("8");
		nine.setText("9");
		clear.setText("C");
		equals.setText("=");
		frame.setVisible(true);
		panel.setLayout(new GridLayout(5,4));
	}

	public void addActionListener(CalculatorControl calculatorControl) {
		// TODO Auto-generated method stub
		addition.addActionListener(calculatorControl);
		subtraction.addActionListener(calculatorControl);
		multiplication.addActionListener(calculatorControl);
		division.addActionListener(calculatorControl);
		zero.addActionListener(calculatorControl);
		one.addActionListener(calculatorControl);
		two.addActionListener(calculatorControl);
		three.addActionListener(calculatorControl);
		four.addActionListener(calculatorControl);
		five.addActionListener(calculatorControl);
		six.addActionListener(calculatorControl);
		seven.addActionListener(calculatorControl);
		eight.addActionListener(calculatorControl);
		nine.addActionListener(calculatorControl);
		clear.addActionListener(calculatorControl);
		equals.addActionListener(calculatorControl);
	}
	

}
