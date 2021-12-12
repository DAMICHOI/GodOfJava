package chapter18.middle;

public class CalculateSalary {
	static Employee[] employees;

	public static void main(String[] args) {
		CalculateSalary calculateSalary = new CalculateSalary();
		long salary;
		calculateSalary.calculateSalaries();
		for (Employee employee : employees) {
			salary = calculateSalary.getSalaryIncrease(employee);
			System.out.println(employee.getName() + "=" + salary);
		}
	}

	public long getSalaryIncrease(Employee employee) {
		int increaseRate = 0;
		long salary = 0L;

		switch (employee.getType()) {
			case 1:
				increaseRate = -95;
				break;
			case 2:
				increaseRate = 10;
				break;
			case 3:
				increaseRate = 20;
				break;
			case 4:
				increaseRate = 30;
				break;
			case 5:
				increaseRate = 100;
				break;
		}

		salary = (long)(employee.getSalary() + (employee.getSalary() * increaseRate * 0.01));
		return salary;
	}

	public void calculateSalaries() {
		employees = new Employee[] {
			new Employee("LeeDaeRi", 1, 1000000000),
			new Employee("KimManager", 2, 100000000),
			new Employee("WhangDesign", 3, 70000000),
			new Employee("ParkArchi", 4, 80000000),
			new Employee("LeeDevelop", 5, 60000000),
		};
	}
}
