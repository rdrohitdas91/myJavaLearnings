package com.citibank.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReadFileData {
	private Reader reader;
	private int size;
	private char[] data;
	
	public String readCharByChar(File file) {
		try {
			reader = new FileReader(file);
			size = (int)file.length();
			data = new char[size];
			int tempData = reader.read();
			int i = 0;
			while(tempData != -1) {
				data[i] = (char)tempData;
				if (data[i] == 's' || data[i] == 'S'){
					data[i] = 'r';
				}
				i++;
				tempData = reader.read();
			}
			String fileData = new String(data);
			return fileData;
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	public String readData(File file) {
		try {
			reader = new FileReader(file);
			size = (int)file.length();
			data = new char[size];
			reader.read(data);
			String fileData = new String(data);
			return fileData;
			
		} catch (FileNotFoundException e) {
			System.out.println("File not found");
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Something is wrong in the read file");
			e.printStackTrace();
		}
		finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Exception while Closing");
				e.printStackTrace();
			}
		}
		return null;
	}
	

}
