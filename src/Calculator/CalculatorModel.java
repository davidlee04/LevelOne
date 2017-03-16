package Calculator;

public class CalculatorModel {
	String firstNumber = "";
	String secondNumber = "";
	double firstInt = 0;
	double secondInt = 0;
	double answer;
	String operator = "";
	boolean operatorPressed = false;

	public void addDigit(int num) {
		if (operatorPressed == false) {
			firstNumber = firstNumber + num;
		}
		if (operatorPressed == true) {
			secondNumber = secondNumber + num;
		}
	}

	public void addOperator(String op) {
		operator = operator + op;
	}

	public void parseNums() {
		firstInt = Double.parseDouble(firstNumber);
		secondInt = Double.parseDouble(secondNumber);
	}

	public double getAnswer() {
		return answer;
	}

	public void findAnswer(double firstNum, double secondNum, String operator) {
		double temp = 0;
		if (operator.equals("+")) {
			temp = firstNum + secondNum;
		}
		if (operator.equals("-")) {
			temp = firstNum - secondNum;
		}
		if (operator.equals("÷")) {
			temp = firstNum / secondNum;
		}
		if (operator.equals("*")) {
			temp = firstNum * secondNum;
		}
		setAnswer(temp);
	}

	public void setAnswer(double answer) {
		this.answer = answer;
	}

	public void clearValues() {
		firstNumber = "";
		firstInt = 0;
		secondNumber = "";
		secondInt = 0;
		answer = 0;
		operator = "";
		operatorPressed = false;
	}

}
