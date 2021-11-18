package chapter04;

public class ProfilePrint {
	byte age;
	String name;
	boolean isMarried;

	public ProfilePrint() {
	}

	public static void main(String[] args) {
		ProfilePrint profilePrint = new ProfilePrint();
		profilePrint.setAge((byte)28);
		profilePrint.setName("Laura");
		profilePrint.setMarried(false);
		System.out.println("age=" + profilePrint.getAge());
		System.out.println("name=" + profilePrint.getName());
		System.out.println("isMarried=" + profilePrint.isMarried());
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public byte getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setMarried(boolean flag) {
		isMarried = flag;
	}

	public boolean isMarried() {
		return isMarried;
	}
}
