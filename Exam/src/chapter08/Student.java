package chapter08;

import java.util.Objects;

public class Student {
	String name;
	String address;
	String phone;
	String email;

	public Student(String name) {
		this.name = name;
	}

	public Student(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}

	@Override
	public String toString() {
		return name + " " + address + " " + phone + " " + email;
	}

	public void checkEquals() {
		Student a = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");
		Student b = new Student("Min", "Seoul", "010XXXXXXXX", "ask@godofjava.com");

		if (a.equals(b)) {
			System.out.println("Equal");
		} else {
			System.out.println("Not Equal");
		}
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		Student student = (Student)o;
		return Objects.equals(name, student.name) && Objects.equals(address, student.address)
			&& Objects.equals(phone, student.phone) && Objects.equals(email, student.email);
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, address, phone, email);
	}
}
