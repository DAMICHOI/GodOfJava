package Chapter01;

public class Calculator {
	public int add(int num1, int num2) {
		int sum = 0;
		sum = num1 + num2;
		return sum;
	}

	public int subtract(int num1, int num2) {
		int result = 0;
		result = num1 - num2;
		return result;
	}

	public int multiply(int num1, int num2) {
		int result = 0;
		result = num1 * num2;
		return result;
	}

	public int divide(int num1, int num2) {
		int result = 0;
		result = num1 / num2;
		return result;
	}
}
