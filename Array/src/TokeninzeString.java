import java.util.*;

public class TokeninzeString {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		ArrayList<String> list = new ArrayList<String>();
		String str = scan.nextLine();
		StringBuffer sb = null;

		for (int i = 0; i < str.length(); i++) {
			sb = new StringBuffer();

			if (str.charAt(i) == '"') {
				sb.append(String.valueOf(str.charAt(i)));
				i++;
				while (true) {
					if (str.charAt(i) == '"') {
						sb.append(String.valueOf(str.charAt(i)));
						i++;
						break;
					}
					sb.append(String.valueOf(str.charAt(i)));
					i++;
				}
			} else {
				while (true) {
					if (str.charAt(i) == ' ')
						break;
					sb.append(String.valueOf(str.charAt(i)));
					i++;
				}
			}
			list.add(sb.toString());
		}
		System.out.println(list);
	}// main
}
// xyz abc mnp "asdf dfaa asdf" asd "fdas asdsdaff"