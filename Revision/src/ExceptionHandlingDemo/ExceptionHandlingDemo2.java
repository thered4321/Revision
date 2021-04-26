package ExceptionHandlingDemo;

public class ExceptionHandlingDemo2 {

	public static void main(String[] args) 
	{
		int arr[]=new int[3];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		try 
		{
		arr[3]=40;
		}
		catch(ArithmeticException e)
		{
			System.out.println("Handled Arithmetic Exception successfully");
		}
		catch(ArrayIndexOutOfBoundsException e1)
		{
			System.out.println(e1.getMessage());
			System.out.println("Handled ArrayIndexOutOfBoundsException successfully");
		}
		
		for(int i:arr)
		{
			System.out.println(i);
		}
	}

}
