package Array;

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
//		int arr[]= new int[5];
//		arr[0]=10;
//		arr[1]=20;
//		arr[2]=30;
//		arr[3]=40;
//		arr[4]=50;
//		
//		for(int i:arr)
//		{
//			System.out.println(i);
//		}
		
		int arr[] = {50,40,30,20,10};
		
		for(int i: arr)
		{
			System.out.println(i);
		}
		System.out.println("-----------------------");
		arr[3] =88;
		for(int i: arr)
		{
			System.out.println(i);
		}
	}

}
