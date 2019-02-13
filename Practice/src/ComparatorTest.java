import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
class name implements Comparator<ComparatorTest> {
	@Override
	public int compare(ComparatorTest t1, ComparatorTest t2) {

		return t1.getName().toUpperCase().compareTo(t2.getName().toUpperCase());

	}
}

class am implements Comparator<ComparatorTest> {
	@Override
	public int compare(ComparatorTest t1, ComparatorTest t2) {
		if (t1.getA() > t2.getA())
			return 1;
		else
			return -1;
	}
}

class bm implements Comparator<ComparatorTest> {
	@Override
	public int compare(ComparatorTest t1, ComparatorTest t2) {
		if (t1.getB() > t2.getB())
			return 1;
		else
			return -1;
	}
}

class ComparatorTest {
	String name;
	int a, b;

	public ComparatorTest(String name, int a, int b) {
		this.name = name;
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public String getName() {
		return name;
	}

	public static void main(String args[]) throws Exception {

		Scanner s = new Scanner(System.in);
		int testCase = s.nextInt();
		while (testCase-- > 0) {
			ArrayList<ComparatorTest> list = new ArrayList<>();
			int num = s.nextInt();
			while (num-- > 0) {
				String str = s.next();
				int sal = s.nextInt();
				int sal2 = s.nextInt();
				ComparatorTest t = new ComparatorTest(str, sal, sal2);
				list.add(t);
			}

			// System.setProperty("java.util.Arrays.useLegacyMergeSort",
			// "true");
			Collections.sort(list, new name());
			Collections.sort(list, new am());

			int index = s.nextInt();

			ComparatorTest t2 = list.get(index - 1);

			System.out.println(t2.getName() + " " + t2.getA());
		}

		// Write your code here

	}
}