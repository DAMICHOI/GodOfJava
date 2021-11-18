package chapter06;

public class ControlLabel {
	public static void main(String[] args) {
		ControlLabel control = new ControlLabel();
		control.printTimesTable();
	}

	private void printTimesTable() {
		for (int level = 2; level < 10; level++) {
			if (level == 4)
				continue;
			for (int unit = 1; unit < 10; unit++) {
				if (unit == 4)
					break;
				if (level == 4 || unit == 4)
					continue;
				System.out.print(level + "*" + unit + "=" + level * unit + " ");
			}
			System.out.println();
		}
	}
}
