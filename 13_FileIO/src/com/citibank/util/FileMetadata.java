package com.citibank.util;

import java.io.File;
import java.util.Date;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class FileMetadata {
	
	public void printMetadata(File file) {
		if(file.exists()) {
			System.out.println("parent folder = " + file.getParent());
			System.out.println("File path = " + file.getAbsolutePath());
			System.out.println("Name of the file = " + file.getName());
			System.out.println("Size = " + file.length()+ " bytes");
			
			Date date = new Date(file.lastModified());
			
			System.out.println("Last accessed Time = " + date);
			System.out.println("Can read = " + file.canRead());
			System.out.println("Can write = " + file.canWrite());
			System.out.println("Can execute = " + file.canExecute());
			System.out.println("Is File = " + file.isFile());
			System.out.println("Is Directory = " + file.isDirectory());
			System.out.println("Is Hidden = " + file.isHidden());
		}
		else {
			System.out.println("File does not exist");
		}
		
	}

}
