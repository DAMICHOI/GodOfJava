package chapter07;

public class ArrayInitialize {
	static String[] month = {"January", "February", "March", "April", "May", "June",
		"July", "August", "September", "October", "November", "December"};

	public static void main(String[] args) {
		ArrayInitialize array = new ArrayInitialize();
		// array.otherInit();
		System.out.println(array.getMonth(3));
	}

	private String getMonth(int monthInt) {
		return month[monthInt + 1];
	}

	private void otherInit() {
		int[] lottoNumbers = {5, 12, 23, 25, 28, 41, 2};
	}

}
