package chapter06;

public class InterestManager {
	public static void main(String[] args) {
		InterestManager manager = new InterestManager();
		long amount = 1000000;
		int day = 1;
		while (day <= 365) {
			// System.out.println(day);
			// System.out.println(amount * manager.getInterestRate(day));
			System.out.println(manager.calculateAmount(day, amount));
			day+=10;
		}

	}

	public double getInterestRate(int day) {
		double rate = 0;
		if (day >= 1 && day <= 90) {
			rate = 0.005;
		} else if (day >= 91 && day <= 180) {
			rate = 0.01;
		} else if (day >= 181 && day <= 364) {
			rate = 0.02;
		} else if (day >= 365) {
			rate = 0.056;
		}
		return rate;
	}

	public double calculateAmount(int day, long amount) {
		double money = 0;
		InterestManager manager = new InterestManager();
		money = amount + (amount * manager.getInterestRate(day));

		return money;
	}
}
