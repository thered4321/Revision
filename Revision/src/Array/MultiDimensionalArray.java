package Array;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		
		int arr[][]= new int[3][3];
		
		arr[0][0]=34;
		arr[0][1]=65;
		arr[0][2]=78;
		arr[1][0]=12;
		arr[1][1]=35;
		arr[1][2]=13;
		arr[2][0]=90;
		arr[2][1]=98;
		arr[2][2]=399;
		
		for(int i=0; i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				System.out.println(arr[i][j]);
			}
			System.out.println("");
		}

	}

}
