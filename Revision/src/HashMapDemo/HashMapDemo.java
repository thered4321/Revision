
package HashMapDemo;

import java.util.HashMap;


public class HashMapDemo 
{
	public static void main(String[] args)
	{
		HashMap <Integer,String>hm = new HashMap<Integer,String>();
		
		hm.put(1, "Anand");
		hm.put(2, "Dalal");
		hm.put(3, "Aviator");
		hm.put(4, "Pune");
		
		System.out.println(hm.values());
		hm.remove(3);
		System.out.println("-------------------");
		System.out.println("After removing data");
		System.out.println(hm.values());
		
		HashMap hm2 = (HashMap) hm.clone();
		hm2.put(3, "asdfgh");
		System.out.println("-------------------");
		System.out.println("These are values after clone");
		System.out.println(hm2.values());
		
	}
}
