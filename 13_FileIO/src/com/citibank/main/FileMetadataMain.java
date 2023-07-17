package com.citibank.main;

import java.io.File;
import java.util.Scanner;

import com.citibank.util.FileMetadata;

public class FileMetadataMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String path;
		
		System.out.println("Enter file/directory path to print");
		path=scanner.next();
		
		File file = new File(path);
		FileMetadata fileMetadata = new FileMetadata();
		fileMetadata.printMetadata(file);
		

	}

}
