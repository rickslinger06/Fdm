package com.fdmGroup.Exception.Handling;

import java.io.File;
import java.io.FileNotFoundException;

public class FileReading {
	
	public void openFile(String filename) throws FileNotFoundException {
		
		File file = new File(filename);
		try {
		if(file != null) {
		
		throw new FileNotFoundException("File doesExist");
		}
		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
	}
}
