package Chapter08;

public class ReferenceStatic {
	static String name = "Laura";

	public static void main(String[] args) {
		ReferenceStatic.staticMethod();
		ReferenceStatic.staticMethodCallVariable();
	}

	private static void staticMethodCallVariable() {
		System.out.println(name);
	}

	private static void staticMethod() {
		System.out.println("This is a staticMethod.");
	}
}
