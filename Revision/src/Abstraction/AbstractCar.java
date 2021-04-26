package Abstraction;

public class AbstractCar extends AbstractVehicle
{

	@Override
	public void tyre() 
	{
		System.out.println("Having 4 tyres");
		
	}

	@Override
	public void start() 
	{
		System.out.println("Is having key start");
		
	}
	
}
