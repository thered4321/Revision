package Abstraction;

public class AbstractScooter extends AbstractVehicle
{

	@Override
	public void tyre() 
	{
		System.out.println("Having 2 tyres");
		
	}

	@Override
	public void start() 
	{
		System.out.println("Is having kick start");
		
	}
	
}
