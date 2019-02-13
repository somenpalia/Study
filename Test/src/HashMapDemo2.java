import java.util.HashMap;
import java.util.Scanner;

public class HashMapDemo2{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long num= scan.nextLong();
		HashMap<String,Long> contactList = new HashMap<String,Long>();
		/*HashMap<String,String> contactList2 = new HashMap<String,String>();
		contactList2.put("ram", "51651");
*/

		contactList.put("subhi",new Long(123456l));
		contactList.put("mummy",new Long(1234565l));
		contactList.put("subhi",new Long(12389l));
		
		//contactList.put("subhaa",new Long(12389l));
		//contactList.put(null,null);
		//contactList.put("hui",null);
		//contactList.putAll(contactList2);
		System.out.println("list is "+contactList);
		System.out.println("size is "+contactList.size());
		System.out.println("is empty "+contactList.isEmpty());
		System.out.println("is key mummy "+contactList.containsKey("mummy"));

		System.out.println("is value of 123456 "+contactList.containsValue(123456l));
		
		System.out.println("is value of (i/p) 123456 "+contactList.containsValue(num));
		System.out.println("removed is"+contactList.remove("subhaa"));



		
	}
}