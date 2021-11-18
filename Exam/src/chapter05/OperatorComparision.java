package chapter05;

public class OperatorComparision {
	public static void main(String[] args) {
		OperatorComparision sample = new OperatorComparision();
		// sample.comparision();
		// sample.comparision2();
		sample.comparision3();
	}

	private void comparision3() {
		boolean flag1 = true;
		boolean flag2 = false;

		System.out.println(flag1 == flag2);
		System.out.println(flag1 != flag2);
	}

	private void comparision2() {
		char charValue = 'a';
		System.out.println(97 == charValue);
		int intValue = 1;
		double doubleValue = 1.0;
		System.out.println(intValue == doubleValue);
	}

	private void comparision() {
		int intValue1 = 1;
		int intValue2 = 2;
		int intValue3 = 1;
		System.out.println(intValue1 == intValue2);
		System.out.println(intValue1 == intValue3);

		System.out.println(intValue1 != intValue2);
		System.out.println(intValue1 != intValue3);
	}
}
