package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StoringSequencInfo {

	public static void main(String[] args) throws IOException {
		File f = new File("D://FileHandlingDemo");
		
		if(f.exists())
		{
			System.out.println("Directory is Present");
			FileOutputStream fs= new FileOutputStream("D://FileHandlingDemo//Readme.txt");
			String s ="Hello All Good Morning";
			byte b[] = s.getBytes();
			fs.write(b);
			fs.flush();
			fs.close();
			System.out.println("Document Created");
		}
		else
		{
			System.out.println("Directory is not present");
			f.mkdir();
			System.out.println("Directory with name--> "+f+ " is created");
			System.out.println("Run program again");
		}

	}

}
