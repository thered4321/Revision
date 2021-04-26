package FileHandling;

import java.io.File;

public class FileHandlingDemo1 {

	public static void main(String[] args) {
		File f = new File("D://FileHandlingDemo");
		
		if(f.exists())
		{
			System.out.println("Directory Found");
			f.delete();
			System.out.println("Directory delected successfully");
		}
		
		else
		{
			System.out.println("Directory Not Found");
		}

	}

}
