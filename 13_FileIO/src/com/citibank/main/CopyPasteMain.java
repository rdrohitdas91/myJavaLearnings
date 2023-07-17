package com.citibank.main;

import java.io.File;
import java.util.Scanner;
import com.citibank.util.ReadFileData;
import com.citibank.util.WriteFileData;

public class CopyPasteMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String path,data;
		String copyPath,pastePath;
		
		System.out.println("Enter path of the file to copy its content");
		copyPath=scanner.nextLine();
		
		
		File file = new File(copyPath);
		

		ReadFileData readFileData = new ReadFileData();
		data = readFileData.readData(file);
		
		System.out.println("Enter path of the file to paste its content");
		pastePath=scanner.nextLine();
		
		
		File file1 = new File(pastePath);
		
		WriteFileData writeFileData = new WriteFileData();
		boolean result = writeFileData.writeData(file1, data);
		if (result)
			System.out.println("Please check your file");
		else
			System.out.println("Copy/paste Operation failed");


	}

}
