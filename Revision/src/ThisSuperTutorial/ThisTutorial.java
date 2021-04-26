package ThisSuperTutorial;

public class ThisTutorial 
{
	int a = 10;
	public void test()
	{
		int a= 20;
		System.out.println("The value of local a is: "+a);
		System.out.println("The value of Global a is: "+this.a);
	}
}
