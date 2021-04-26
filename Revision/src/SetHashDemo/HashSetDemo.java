package SetHashDemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hs= new HashSet();
		{
			hs.add("1)Manual testiing");
			hs.add("2)Automation Testing");
			hs.add("3)Database Testing");
			hs.add("4)Web service Testing");
			hs.add(null);
			
			Iterator it = hs.iterator();
			for(Object obj:hs)
			{
				System.out.println(obj);
			}
			
		}

	}

}
