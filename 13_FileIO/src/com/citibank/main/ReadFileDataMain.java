package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.FileMetadata;
import com.citibank.util.ReadFileData;

public class ReadFileDataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String path;
		
		System.out.println("Enter file/directory path to print");
		path=scanner.next();
		
		File file = new File(path);
		
		ReadFileData readFileData = new ReadFileData();
		//String data = readFileData.readData(file);
		String data = readFileData.readCharByChar(file);
		System.out.println(data);
		

	}

}
