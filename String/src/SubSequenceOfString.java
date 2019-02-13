import java.util.ArrayList;
import java.util.LinkedHashSet;

public class SubSequenceOfString {

	public static void main(String[] args) {

		String str = "abcde";
		char[] ch = str.toCharArray();
		LinkedHashSet<String> set = new LinkedHashSet<>();
		subSequence(ch, 0, set);

		System.out.println(set);
	}

	private static void subSequence(char ch[], int k, LinkedHashSet<String> set) {

		if (k == ch.length) {
			return;
		}

		StringBuffer sb = new StringBuffer();
		sb.append(ch[k]);

		int outerLoop = ch.length - k;

		for (int i = k + 1; i < ch.length; i++) {

			set.add(sb.toString());
			sb.append(ch[i]);
		}

		set.add(sb.toString());
		
		// StringBuffer sbFinal = (StringBuffer) sb.clone();
		StringBuffer sbFinal = new StringBuffer().append(sb.toString());

		for (int i =1; i < outerLoop - 1; i++) {
			sb.deleteCharAt(i);
			set.add(sb.toString());
			sb = sbFinal;

		}
		
		subSequence(ch, k + 1, set);

	}

}
