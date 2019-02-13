import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/*
@Auther:Surendra kumar sao

	>>Software Architech and Corporate Trainer
	>>+9 year exp in (mumbai,pune,hyd,bangaluru)
	>>Java Certified SCJP & SCWCD with 98%
	Trained more than 4.5k students and employees.
    Mca from (NIT)National Institure of Technology raipur(c.g)
	Email : sur.nit.mca@gmail.com
	Mobile 7987234544, 9009442844
	https://www.urbanpro.com/raipur/surendra-kumar-sao/reviews/7223178
	https://www.urbanpro.com/raipur/surendra-kumar-sao/1334109?_tp=
 
   CurrentYear 2017 
 */
public class SirMapDemo2 {

	public static void main(String[] args) {
		HashMap<String, Long> contactMap = null;

		contactMap = new HashMap<String, Long>();

		System.out.println(contactMap.size());
		System.out.println(contactMap.isEmpty());
		System.out.println(contactMap);
		
		//add key value data into map
		contactMap.put(new String("surendra"), new Long(9009442844L));
		contactMap.put(new String("ramesh"),   new Long(32473434L));
		contactMap.put(new String("gagan"),    new Long(4343433434L));
		contactMap.put(new String("riya"),     new Long(43434344344L));
		contactMap.put(new String("bina"),     new Long(3978484398L));

		System.out.println(contactMap);
		
		System.out.println("----------------------------");
		
		//how to get all keys??
		Set<String> allNameskeys = contactMap.keySet();
		for(String key : allNameskeys) {
			  Long contactValue = contactMap.get(key);
			  System.out.printf("%20s %15s\n",key,contactValue);
		}
		
		
		
		System.out.println("----------------------------");
		
		
		
		 
		System.out.println("enter contact name for search");
		String searchNameKey  = new Scanner(System.in).nextLine();
		boolean isFound = contactMap.containsKey(searchNameKey);
		System.out.println(searchNameKey +" found ??" + isFound);
		
		System.out.println("enter contact number search");
		Long searchContactNumber  = new Scanner(System.in).nextLong();
		boolean isContactNumberFound = contactMap.containsValue(searchContactNumber);
		System.out.println("Given contact number ("+searchContactNumber +") found ??" + isContactNumberFound);
		
		
		
		
		
		
		
		
		
		
	}

}
