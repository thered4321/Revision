package ExceptionHandlingDemo;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
	 int a = 10;
	 int b= 0;
	 int c= 0;
	 
	 try
	 {
		 	c=a/b;
	 }
	catch(ArithmeticException e)	
	 {
		System.out.println("Exception Handelled Successfully");
	 }
	 
	 System.out.println("The result is:" + c);
	}
}
