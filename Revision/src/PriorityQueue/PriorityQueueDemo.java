package PriorityQueue;

import java.util.PriorityQueue;
import java.util.Iterator;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		
		pq.add("Anand");
		pq.add("Dalal");
		pq.add("Santosh");
		pq.add("Snehal");
		pq.add("jyoti");
		
		Iterator it = pq.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		System.out.println("-------------------------");
		System.out.println("1st Element: "+ pq.peek());
		pq.poll();
		System.out.println("-------------------------");
		System.out.println("After eliminating 1st element");
//		for(Object obj:pq)
//		{
//			System.out.println(obj);
//		}
		System.out.println("Now the 1st element is: "+pq.peek());
		System.out.println("--------------------------");
		pq.poll();
		System.out.println("-------------------------");
		System.out.println("Now the 1st element is: "+pq.peek());
//		
		
	}

}
