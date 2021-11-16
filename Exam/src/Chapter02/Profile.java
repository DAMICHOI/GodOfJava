package Chapter02;

public class Profile {
	String name;
	int age;

	public Profile() {
	}

	public static void main(String[] args) {
		// System.out.println("My name is Laura");
		// System.out.println("28");

		Profile profile = new Profile();
		profile.setName("Laura");
		profile.setAge(28);
		profile.printName();
		profile.printAge();
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void printName() {
		System.out.println("My name is " + this.name);
	}

	public void printAge() {
		System.out.println("My age is " + this.age);
	}
}
