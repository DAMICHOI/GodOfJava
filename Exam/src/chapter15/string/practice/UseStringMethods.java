package chapter15.string.practice;

public class UseStringMethods {
	public static void main(String[] args) {
		UseStringMethods sample = new UseStringMethods();
		String str = "The String class represents character strings.";
		// sample.printWords(str);
		// sample.findString(str, "string");
		// sample.findAnyCaseString(str, "string");
		// sample.countChar(str, 's');
		sample.printContainWords(str, "ss");
	}

	public void printWords(String str) {
		String[] array = str.split(" ");
		for (String data : array) {
			System.out.println(data);
		}
	}

	public void findString(String str, String findStr) {
		int strIndex = str.indexOf(findStr);
		System.out.println("string is appeared at " + strIndex);
	}

	public void findAnyCaseString(String str, String findStr) {
		int strIndex = str.toLowerCase().indexOf(findStr);
		System.out.println("string is appeared at " + strIndex);
	}

	public void countChar(String str, char c) {
		char[] charArray = str.toCharArray();
		int countChar = 0;
		for (char data : charArray) {
			if (data == c) {
				countChar++;
			}
		}

		System.out.println("char 's' count is " + countChar);
	}

	public void printContainWords(String str, String findStr) {
		for (String data : str.split(" ")) {
			if (data.contains(findStr)) {
				System.out.println(data + " contains " + findStr);
			}
		}
	}
}
