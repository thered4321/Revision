package LooseCoupling;

public class LedStatus implements Switch
{

	@Override
	public void lighton() 
	{
		System.out.println("Led is ON");
	}

	@Override
	public void lightoff() 
	{
		System.out.println("Led is OFF");
	}
	
}
