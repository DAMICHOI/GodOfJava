package chapter08;

public class ManageStudent {
	public static void main(String[] args) {
		Student[] student = null;
		ManageStudent management = new ManageStudent();
		student = management.addStudent();
		management.printStudents(student);
	}

	public Student[] addStudent() {
		Student[] student = new Student[3];
		student[0] = new Student("Lim");
		student[1] = new Student("Min");
		student[2] = new Student("Sook", "Seoul", "010XXXXYYYY", "ask@godofjava.com");
		return student;
	}

	public void printStudents(Student[] student) {
		// System.out.println(student.toString());
		for (Student data : student) {
			System.out.println(data.toString());
		}
	}

}
