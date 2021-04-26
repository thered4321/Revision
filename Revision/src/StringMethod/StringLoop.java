package StringMethod;

public class StringLoop 
{
	public static void main(String[] args) 
	{
		System.out.println("Main method started");
		String s="softtechclasses";
		String s1= new String("softtechclasses");
		String s2="softtechclasses";
		String s3=new String("softtechclasses");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("-------------------------");
		System.out.println(s==s1);
		System.out.println(s==s2);
		System.out.println(s==s3);
		System.out.println(s1==s2);
		System.out.println("---------------------------");
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s3));
		System.out.println(s1.equals(s2));
		System.out.println("main method ended");
	}
}
