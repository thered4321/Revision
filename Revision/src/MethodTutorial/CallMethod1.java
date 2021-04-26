package MethodTutorial;

public class CallMethod1 
{
	static void call1()
	{
		System.out.println("Running Call Method 1");
		CallMethod2.call2();
		System.out.println("Running Back from Method 1");
	}
}
