package Chapter05;

public class OperatorConditionalTriple {
	public static void main(String[] args) {
		OperatorConditionalTriple operator = new OperatorConditionalTriple();
		operator.doBlindDate(80);
		operator.doBlindDate(50);
	}

	public boolean doBlindDate(int point) {
		boolean doBlindeDateFlag = false;
		doBlindeDateFlag = (point >= 80) ? true : false;
		System.out.println(point + " : " + doBlindeDateFlag);
		return doBlindeDateFlag;
	}
}
