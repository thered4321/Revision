package ArrayListDemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) 
	{
		ArrayList arr = new ArrayList();
		arr.add("Anand");
		arr.add(26);
		arr.add("Dell");
		arr.add(null);
		
		System.out.println(arr.isEmpty());
		System.out.println(arr.size());
		System.out.println(arr.get(2));
		System.out.println("ArrayList Elements");
		
		Iterator it = arr.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println("-------------------------------------------");
		
		arr.remove(2);
		for(Object obj:arr)
		{
			System.out.println(obj);
		}
	}

}
