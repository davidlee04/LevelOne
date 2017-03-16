package Calculator;

public class Calculator {
	public static void main(String[] args) {
		CalculatorModel model = new CalculatorModel();
		CalculatorView view = new CalculatorView();
		CalculatorControl control = new CalculatorControl(view, model);
	}

}
