package Interface;

public abstract class InterfaceTutorial2 implements InterfaceTurorial
{

	@Override
	public void display() 
	{
		System.out.println("This is Display Method");
	}

	@Override
	public void show() 
	{
		System.out.println("This show Method");	
	}

	@Override
	public abstract void test();
	
	

}
