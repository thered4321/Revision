package MethodTutorial;

public class CallMethod2 
{
	static void call2()
	{
		System.out.println("Running Call Method 2");
		CallMethod3.call3();
		System.out.println("Running Back from Method 2");
	}
}	
