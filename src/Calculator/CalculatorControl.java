package Calculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorControl implements ActionListener{
	CalculatorView view;
	CalculatorModel model;

	public CalculatorControl(CalculatorView view, CalculatorModel model) {
		// TODO Auto-generated constructor stub
		this.view = view;
		this.model = model;
		view.addActionListener(this);
	
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource() == view.zero){
			model.addDigit(0);
			view.firstDisplay.setText(model.firstNumber);
			view.thirdDisplay.setText(model.secondNumber);
		}
		if(e.getSource() == view.one){
			model.addDigit(1);
			view.firstDisplay.setText(model.firstNumber);
			view.thirdDisplay.setText(model.secondNumber);
		}
		if(e.getSource() == view.two){
			model.addDigit(2);
			view.firstDisplay.setText(model.firstNumber);
			view.thirdDisplay.setText(model.secondNumber);
		}
		if(e.getSource() == view.three){
			model.addDigit(3);
			view.firstDisplay.setText(model.firstNumber);
			view.thirdDisplay.setText(model.secondNumber);
		}
		if(e.getSource() == view.four){
			model.addDigit(4);
			view.firstDisplay.setText(model.firstNumber);
			view.thirdDisplay.setText(model.secondNumber);
		}
		if(e.getSource() == view.five){
			model.addDigit(5);
			view.firstDisplay.setText(model.firstNumber);
			view.thirdDisplay.setText(model.secondNumber);
		}
		if(e.getSource() == view.six){
			model.addDigit(6);
			view.firstDisplay.setText(model.firstNumber);
			view.thirdDisplay.setText(model.secondNumber);
		}
		if(e.getSource() == view.seven){
			model.addDigit(7);
			view.firstDisplay.setText(model.firstNumber);
			view.thirdDisplay.setText(model.secondNumber);
		}
		if(e.getSource() == view.eight){
			model.addDigit(8);
			view.firstDisplay.setText(model.firstNumber);
			view.thirdDisplay.setText(model.secondNumber);
		}
		if(e.getSource() == view.nine){
			model.addDigit(9);
			view.firstDisplay.setText(model.firstNumber);
			view.thirdDisplay.setText(model.secondNumber);
		}
		if(e.getSource() == view.addition){
			model.addOperator("+");
			model.operatorPressed = true;
			view.secondDisplay.setText(model.operator);
		}
	  
	}

}
