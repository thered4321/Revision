package StringMethod;

public class StringSplitDemo {

	public static void main(String[] args) 
	{
		String s = "Softtech,Classes,kothrud,Pune,India";
		System.out.println("The given String is:" + s );
		for(String s1:s.split(","))
		{
			System.out.println(s1);
		}
	}

}
