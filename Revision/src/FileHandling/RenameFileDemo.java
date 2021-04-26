package FileHandling;

import java.io.File;

public class RenameFileDemo {

	public static void main(String[] args) {
		File f = new File("D://FileHandlingDemo");
		File f1 = new File("D:/RenameTutorial");
		
		if(f.exists())
		{
			
			System.out.println("Directory Found");
			f.renameTo(f1);
			System.out.println("Directory Successfully Renamed: "+ f1);
		}
		else
		{
			f.mkdir();
			System.out.println("File not found");
		}
		
	}

}
