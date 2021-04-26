package ThisSuperTutorial;

public class SuperTutorial extends ThisTutorial
{
	int a= 30;
	public void test2() 
	{
		int a= 40;
		System.out.println("local child value of a is: "+a);
		System.out.println("local child value of a is: "+this.a);
		System.out.println("local child value of a is: "+super.a);
	}

}
