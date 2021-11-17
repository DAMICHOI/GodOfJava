package Chapter08;

public class ReferenceReturn {
	public static void main(String[] args) {
		ReferenceReturn reference = new ReferenceReturn();
		System.out.println(reference.intReturn());
		System.out.println(reference.intArrayReturn());
		System.out.println(reference.stringReturn());
		System.out.println(reference.calculateAfterIntReturn());
	}

	private String stringReturn() {
		String returnString = "Return value";
		return returnString;
	}

	private int[] intArrayReturn() {
		int returnArray[] = new int[10];
		return returnArray;
	}

	private int intReturn() {
		int returnInt = 0;
		return returnInt;
	}

	public int calculateAfterIntReturn() {
		int returnInt = 0;
		if (returnInt == 0) {
			return ++returnInt;
		}
		return --returnInt;
	}
}
