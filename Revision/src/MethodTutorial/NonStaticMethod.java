package MethodTutorial;

public class NonStaticMethod 
{
	public void m1()
	{
		System.out.println("This is non static m1 method");
		m2();
	}
	
	public static void m2()
	{
		System.out.println("This is non static m2 method");
	}
	
	public static void main(String[] args)
	{
		System.out.println("This is main method");
		NonStaticMethod obj = new NonStaticMethod();
		obj.m1();
		m2();
		System.out.println("This is main method");
		
	}
}
