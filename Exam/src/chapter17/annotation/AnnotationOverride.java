package chapter17.annotation;

import chapter17.inheritance.Parent;

public class AnnotationOverride extends Parent {
	@Override
	public void printName() {
		System.out.println("AnnotationOverride");
	}
}
