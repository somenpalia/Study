import java.util.HashMap;

public class HashMapDemo{
	public static void main(String[] args) {
		HashMap<String,Long> contactList = new HashMap<String,Long>();
		/*HashMap<String,String> contactList2 = new HashMap<String,String>();
		contactList2.put("ram", "51651");
*/

		contactList.put("subhi",123456l);
		/*contactList.put("mummy",new Long(1234565));
		contactList.put("subhi",new Long(12389));
		contactList.put("subhaa",new Long(12389));
		contactList.put(null,null);
		contactList.put("hui",null);*/
		
		//contactList.putAll(contactList2);
		
		System.out.println("list is "+contactList);
		System.out.println("size is "+contactList.size());
		System.out.println("is empty "+contactList.isEmpty());
		System.out.println("is key mummy "+contactList.containsKey("mummy"));

		System.out.println("is value of 123456 "+contactList.containsValue(123456l));
		System.out.println("removed is "+contactList.remove("subhaa"));



		
	}
}