package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.ReadFileData;
import com.citibank.util.WriteFileData;


public class WriteFileDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String path;
		String data;
		
		System.out.println("Enter directory path to write data");
		path=scanner.nextLine();
		System.out.println("Enter file content");
		data=scanner.nextLine();
		
		File file = new File(path);
		
		WriteFileData writeFileData = new WriteFileData();
		boolean result = writeFileData.writeData(file, data);
		if (result)
			System.out.println("Please check your file");
		else
			System.out.println("write Operation failed");

	}

}
