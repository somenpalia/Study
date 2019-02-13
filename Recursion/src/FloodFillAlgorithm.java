import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class FloodFillAlgorithm {

	public static int ROW;
	public static int COLUMN;

	static int[][] arr = null;

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int testCases = scan.nextInt();
		while (testCases-- > 0) {

			ROW = scan.nextInt();
			COLUMN = scan.nextInt();

			arr = new int[ROW][COLUMN];

			for (int i = 0; i < ROW; i++)
				for (int j = 0; j < COLUMN; j++)
					arr[i][j] = scan.nextInt();

			int x = scan.nextInt();
			int y = scan.nextInt();
			int k = scan.nextInt();
			changeColor(x, y, k, arr[x][y]);
			print();
		}// while test case wala

	}

	static void print() {
		for (int i = 0; i < ROW; i++) {
			for (int j = 0; j < COLUMN; j++) {
				System.out.print(arr[i][j] + " ");
			}
		}// j
		System.out.println();
	}

	static class Element {
		int x;
		int y;

		public Element(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}// Element

	public static boolean isValid(int x, int y) {
		return (x >= 0 && y >= 0 && x < arr.length && y < arr[0].length);
	}

	private static void changeColor(int x, int y, int k, int currentColor) {

		arr[x][y] = k;

		// left
		if (isValid(x, y - 1) && arr[x][y - 1] == currentColor) {
			arr[x][y - 1] = k;
			changeColor(x, y - 1, k, currentColor);
		}

		// right
		if (isValid(x, y + 1) && arr[x][y + 1] == currentColor) {
			arr[x][y + 1] = k;
			changeColor(x, y + 1, k, currentColor);
		}

		// up
		if (isValid(x - 1, y) && arr[x - 1][y] == currentColor) {
			arr[x - 1][y] = k;
			changeColor(x - 1, y, k, currentColor);
		}

		// down
		if (isValid(x + 1, y) && arr[x + 1][y] == currentColor) {
			arr[x + 1][y] = k;
			changeColor(x + 1, y, k, currentColor);
		}

		return;
	}// changeColor

}
