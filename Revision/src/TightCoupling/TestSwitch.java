package TightCoupling;

public class TestSwitch 
{
	public static void main(String[] args)
	{
		LEDBulbSwitch sw = new LEDBulbSwitch();
		
		sw.lighton();
		sw.lightoff();
	}
}
