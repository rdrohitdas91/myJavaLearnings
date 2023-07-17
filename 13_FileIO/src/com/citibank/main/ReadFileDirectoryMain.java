package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.FileMetadata;
import com.citibank.util.ReadFileData;

public class ReadFileDirectoryMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String path;
		int count = 0;
		
		System.out.println("Enter directory path to print");
		path=scanner.next();
		
		File file = new File(path);
		File [] allFiles =file.listFiles();
		ReadFileData readFileData = new ReadFileData();
		for(File f : allFiles) {
			if(f.isFile()) {
				String data = readFileData.readData(f);
				System.out.println(f.getName());
				System.out.println(data);
				System.out.println();
				count = count + 1;
				
			}
		}
		System.out.println("Total Count is = " + count);
	}
	
}
		
