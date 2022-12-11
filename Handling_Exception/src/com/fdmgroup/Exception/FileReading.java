package com.fdmgroup.Exception;

import java.io.File;
import java.io.FileNotFoundException;

public class FileReading {
	
	public void openFile(String filename)throws FileNotFoundException {
		File file = new File(filename);
		if(file.exists()) {
			System.out.println("The file exist");	
		}else {
			
			throw new FileNotFoundException("File Does not Exits");
		}
		
	}

}
