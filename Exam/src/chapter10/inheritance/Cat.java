package chapter10.inheritance;

public class Cat extends Animal{
	public static void main(String[] args) {
		Animal cat = new Cat();
		cat.move();
	}

	@Override
	public void move() {
		// super.move();
		System.out.println("cat move");
	}
}
