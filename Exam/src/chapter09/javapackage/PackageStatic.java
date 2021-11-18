package chapter09.javapackage;

import static chapter09.javapackage.sub.SubStatic.subStaticMethod;
import static chapter09.javapackage.sub.SubStatic.CLASS_NAME;

public class PackageStatic {
	public static void main(String[] args) {
		// SubStatic.subStaticMethod();
		// System.out.println(SubStatic.CLASS_NAME);
		subStaticMethod();
		System.out.println(CLASS_NAME);
	}
}
