package TreeSetDemo;

import java.util.TreeSet;
import java.util.Iterator;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		
		ts.add("Dalal");
		ts.add("Anand");
		ts.add("Santosh");
		ts.add("dalal");
		ts.add("anand");
		ts.add("santosh");
		//ts.add(02);
//		try
//		{
//			ts.add(null);
//		}
//		
//		catch(NullPointerException e)
//		{
//			System.out.println(e.getMessage());
//			System.out.println(e.getCause());
//			System.out.println(e.hashCode());
//			System.out.println(e.getClass());
//			System.out.println("NullPointerException Handled Successfully");
//		}
		Iterator it = ts.iterator();
		{
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
		}

	}

}
