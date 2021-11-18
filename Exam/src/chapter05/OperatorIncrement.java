package chapter05;

public class OperatorIncrement {
	public static void main(String[] args) {
		OperatorIncrement sample = new OperatorIncrement();
		sample.increment();
		System.out.println("---------------------");
		sample.increment2();
	}

	private void increment2() {
		int intValue = 1;
		System.out.println(intValue);
		intValue = intValue + 1;
		System.out.println(intValue);
		intValue = intValue + 1;
		System.out.println(intValue);
	}

	private void increment() {
		int intValue = 1;
		System.out.println(intValue++);
		System.out.println(intValue);
		System.out.println(++intValue);
	}
}
