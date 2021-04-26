package NonPrimitiveCasting;

public class DownCastingTest {

	public static void main(String[] args) 
	{
		DownCastingFather obj = new DownCastingSon();
		DownCastingSon obj1 = (DownCastingSon) obj;
		
		obj.House();
		obj.Car();
		obj1.Bike();
	}

}
