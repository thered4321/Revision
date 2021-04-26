package Interface;

public class InterfaceTutorial3 extends InterfaceTutorial2{

	public static void main(String[] args) 
	{
		InterfaceTutorial3 obj = new InterfaceTutorial3();
		obj.display();
		obj.show();
		obj.test();

	}

	@Override
	public void test() 
	{
		System.out.println("This is Test Method");	
	}

}
