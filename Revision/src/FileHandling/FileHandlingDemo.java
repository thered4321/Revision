package FileHandling;

import java.io.File;

public class FileHandlingDemo {

	public static void main(String[] args) {
		
		File f = new File("D://FileHandlingDemo");
		
		if(f.exists())
		{
			System.out.println("The Directory is already exist");
		}
		else
		{
			f.mkdir();
			System.out.println("The Directory Created as new");
		}

	}

}
