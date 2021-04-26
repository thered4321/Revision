package NonPrimitiveCasting;

public class UpcastingTest extends UpCastingFather
{

	public static void main(String[] args) 
	{
		UpCastingFather Father = new UpCastingSon();
		
		Father.house();
		Father.car();
		

	}

}
