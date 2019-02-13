import java.util.LinkedHashSet;

public class SubSequenceOfString2 {
	static LinkedHashSet<String> set = new LinkedHashSet<>();
	public static void main(String[] args) {

		String str = "abc";
		subSequence(str);
		
		System.out.println(set);

	}

	private static void subSequence(String str) {

		for (int i = 0; i < str.length(); i++) {
			for(int j  = str.length() ; j > i ; j--){
				String sub = str.substring(i, j);
				if(!set.contains(sub)){
					set.add(sub);
				}//if
				
			for (int k = 1; k < sub.length()-1; k++) {
				StringBuffer sb = new StringBuffer(sub);
				sb.deleteCharAt(k);
				//if(!set.contains(sb.toString())){
					subSequence(sb.toString());
				//}
			}
				
			}//j
		}//i
	}

}
