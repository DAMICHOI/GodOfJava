package chapter06;

public class ControlWhile {
	public static void main(String[] args) {
		ControlWhile control = new ControlWhile();
		// control.whileLoop1();
		// control.whileLoop2();
		// control.whileBreak();
		// control.whileContinue();
		control.whileContinueInfinit();
	}

	public void whileContinueInfinit() {
		ControlSwitch control = new ControlSwitch();
		int loop = 0;
		while (loop < 12) {
			if (loop == 6)
				continue;
			loop++;
			control.switchCalendar(loop);
		}
	}

	private void whileContinue() {
		ControlSwitch control = new ControlSwitch();
		int loop = 0;
		while (loop < 12) {
			loop++;
			if (loop == 6)
				continue;
			control.switchCalendar(loop);
		}
	}

	private void whileBreak() {
		ControlSwitch control = new ControlSwitch();
		int loop = 0;
		while (loop < 12) {
			loop++;
			control.switchCalendar(loop);
			if (loop == 6)
				break;
		}
	}

	private void whileLoop2() {
		ControlSwitch control = new ControlSwitch();
		int loop = 0;
		while (loop < 12) {
			loop++;
			control.switchCalendar(loop);
			if (loop == 6)
				loop = 100;
		}
	}

	private void whileLoop1() {
		ControlSwitch control = new ControlSwitch();
		int loop = 0;
		while (loop < 12) {
			loop++;
			control.switchCalendar(loop);
		}
	}
}
