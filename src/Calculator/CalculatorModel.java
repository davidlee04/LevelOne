package Calculator;

public class CalculatorModel {	
	String firstNumber = "";
	String secondNumber = "";
	int answer;
	String operator = "";
	boolean operatorPressed = false;
	
	public void addDigit(int num){
		if(operatorPressed == false){
			firstNumber = firstNumber + num;
		}
		if(operatorPressed == true){
			secondNumber = secondNumber + num;
		}
	}
	
	public void addOperator(String op){
		operator = operator + op;
	}

}
