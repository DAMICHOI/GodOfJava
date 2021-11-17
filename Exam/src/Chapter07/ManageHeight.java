package Chapter07;

public class ManageHeight {
	int gradeHeights[][];

	public static void main(String[] args) {
		ManageHeight manageHeight = new ManageHeight();
		manageHeight.setData();
		System.out.println("결과");
		// manageHeight.printHeight(1);
		// manageHeight.printHeight(2);
		// manageHeight.printHeight(3);
		// manageHeight.printHeight(4);
		// manageHeight.printHeight(5);
		int classNo = 1;
		while (classNo < 6) {
			manageHeight.printAverage(classNo);
			classNo++;
		}
	}

	public void setData() {
		gradeHeights = new int[][] {{170, 180, 173, 175, 177}, {160, 165, 167, 186},
			{158, 177, 187, 176}, {173, 182, 181}, {170, 180, 165, 177, 172}};
	}

	public void printHeight(int classNo) {
		int[] heightArray = gradeHeights[classNo - 1];
		System.out.println("Class No. : " + classNo);
		for (int height : heightArray) {
			System.out.println(height);
		}
	}

	public void printAverage(int classNo) {
		double average;
		int sum = 0;
		int studentCount = gradeHeights[classNo - 1].length;
		for (int height : gradeHeights[classNo - 1]) {
			sum += height;
		}
		average = sum / (double)studentCount;
		System.out.println("Class No. : " + classNo);
		System.out.println("Height average: " + average);
	}
}
