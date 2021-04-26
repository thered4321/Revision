package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DocumentCreation {

	public static void main(String[] args) throws IOException {
		
		File f = new File("D:\\RenameTutorial");
		
		if(f.exists())
		{
			FileOutputStream fs = new FileOutputStream("D:\\RenameTutorial\\Readme.txt");
			fs.write(67);
			fs.close();
			System.out.println("Created Successfully");
		}
		else
		{
			System.out.println("Directory Not Found");
			f.mkdir();
			System.out.println("Directory Created now");
		}
	
	}

}
