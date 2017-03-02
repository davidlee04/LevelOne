package Calculator;

public class Calculator {
	public static void main(String[] args) {
		CalculatorView view = new CalculatorView();
		CalculatorModel model = new CalculatorModel();
		CalculatorControl control = new CalculatorControl(view, model);
	}

}
