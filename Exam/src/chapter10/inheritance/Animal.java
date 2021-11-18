package chapter10.inheritance;

public class Animal {
	String name;
	String kind;
	int legCount;
	int iq;
	boolean hasWing;

	public Animal() {
	}

	public void move() {
		System.out.println("Animal move");
	}

	public void eatFood() {
		System.out.println("eat food.");
	}
}
