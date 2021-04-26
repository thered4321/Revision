package MethodTutorial;

import java.util.ArrayList;

public class ArrayMethods 
{

//	public static void main(String[] args) 
//	{
//		int a[] = {10,20,30,40,50};
//		int i=0;
//		while(i<a.length)
//		{
//			System.out.println(a[i]);
//			i++;
//		}
//			
//	}
			//***Enhanced For Loop***//
//	public static void main(String[] args) 
//	{
//		int a[] = {20,30,10,40};
////		int i;
//		
//		for(int i:a)
//		{
//			System.out.println(i);
//		}
//	}
	
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		list.add("Anand");
		list.add("Dalal");
		list.add("Andy");

		for(String s:list)
		{
			System.out.println(s);
		}
	}
}




