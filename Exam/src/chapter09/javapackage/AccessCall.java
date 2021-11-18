package chapter09.javapackage;

import chapter09.javapackage.sub.AccessModifier;

public class AccessCall {
	public static void main(String[] args) {
		AccessModifier accessModifier = new AccessModifier();
		accessModifier.publicMethod();
		// accessModifier.protectedMethod();
		// accessModifier.packagePrivateMethod();
		// accessModifier.privateMethod();
	}
}
