package chapter09.javapackage;

import chapter09.javapackage.sub.Sub;

public class Package {
	public static void main(String[] args) {
		// System.out.println("Package class.");
		Sub sub = new Sub();
		sub.subClassMethod();
	}
}
