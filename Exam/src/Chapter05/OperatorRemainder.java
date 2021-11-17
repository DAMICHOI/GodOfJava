package Chapter05;

public class OperatorRemainder {
	public static void main(String[] args) {
		OperatorRemainder sample = new OperatorRemainder();
		sample.remainder();
	}

	private void remainder() {
		int intValue1 = 53;
		int intValue2 = 10;
		int result = intValue1 % intValue2;
		System.out.println(result);

		intValue1 = 50;
		result = intValue1 % intValue2;
		System.out.println(result);
	}
}
