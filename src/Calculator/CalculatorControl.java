package Calculator;

public class CalculatorControl {
	CalculatorView view;
	CalculatorModel model;

	public CalculatorControl(CalculatorView view, CalculatorModel model) {
		// TODO Auto-generated constructor stub
		this.view = view;
		this.model = model;
		view.addActionListener(this);
	
	}

}
