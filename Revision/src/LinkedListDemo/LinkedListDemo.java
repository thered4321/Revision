package LinkedListDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList lrr = new LinkedList();
		{
			lrr.add("ANand");
			lrr.add("dkpokapfkafko");
			lrr.add("jdaslfjiefjkjasijaprmlaffjf");
			lrr.add("asfj");
			
			System.out.println("Linked List Elements");
			Iterator it = lrr.iterator();
			
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			System.out.println("--------------------------");
			lrr.remove(2);
			for(Object obj:lrr)
			{
				System.out.println(obj);
			}
			
			System.out.println("--------------------------");
			System.out.println(lrr.getFirst());
			System.out.println(lrr.getLast());
			System.out.println(lrr.getClass());
	//		System.out.println(lrr.offerFirst(it));
			System.out.println(lrr.peekFirst());		
		}

	}

}
