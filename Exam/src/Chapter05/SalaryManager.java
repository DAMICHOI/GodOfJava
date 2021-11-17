package Chapter05;

public class SalaryManager {
	public static void main(String[] args) {
		SalaryManager salaryManager = new SalaryManager();
		int yearSalary = 20000000;
		double monthSalary = salaryManager.getMonthlySalary(yearSalary);
		System.out.println(monthSalary);
	}

	public double getMonthlySalary(int yearlySalary) {
		double monthSalary = (double)yearlySalary / 12.0;
		double incomeTax = calculateTax(monthSalary);
		double nationalPension = calculateNationalPension(monthSalary);
		double healthInsurance = calculateHealthInsurance(monthSalary);
		monthSalary -= (incomeTax + nationalPension + healthInsurance);
		return monthSalary;
	}

	public double calculateTax(double monthSalary) {
		double incomeTax = monthSalary * 0.125;
		System.out.println("근로소득세:" + incomeTax);
		return incomeTax;
	}

	public double calculateNationalPension(double monthSalary) {
		double nationalPension = monthSalary * 0.081;
		System.out.println("연금: " + nationalPension);
		return nationalPension;
	}

	public double calculateHealthInsurance(double monthSalary) {
		double healthInsurance = monthSalary * 0.135;
		System.out.println("건강보험료: " + healthInsurance);
		return healthInsurance;
	}
}
