package Abstraction;

public class AbstractMain {

	public static void main(String[] args) 
	{
		AbstractCar car = new AbstractCar();
		AbstractScooter scooter = new AbstractScooter();
		
		car.tyre();
		car.start();
		
		scooter.tyre();
		scooter.start();
	}

}
