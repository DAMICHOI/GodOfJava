package Chapter06;

public class ControlIfAndOf {
	public static void main(String[] args) {
		ControlIfAndOf control = new ControlIfAndOf();
		// control.ifAndOr();
		control.tripleOrAnd();
	}

	private void tripleOrAnd() {
		int age = 25;
		boolean isMarried = true;
		double height = 180;
		if (age > 25 || isMarried && height >= 180) {
			System.out.println("Age is over 25 or Married and height is over 180.");
		}
	}

	private void ifAndOr() {
		int age = 25;
		boolean isMarried = true;

		if (age > 25 && isMarried) {
			System.out.println("Age is over 25 and Married.");
		}
		if (age > 25 || isMarried) {
			System.out.println("Age is over 25 or Married.");
		}
	}
}
