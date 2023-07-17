package com.citibank.main;

import java.util.Scanner;

import com.citibank.domain.Application;
import com.citibank.domain.SmsMessage;
import com.citibank.domain.EmailMesage;
import com.citibank.domain.Message;
import com.citibank.domain.WhatsappMessage;

public class ApplicationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String To = null;
		String MessageText = null;
		int mobileNumber;
		int choice;
		Message message = null;
		String continueChoice = "";
		

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter To");
		To = scanner.nextLine();

		System.out.println("Enter MessageText");
		MessageText = scanner.nextLine();


			System.out.println("Menu");
			System.out.println("1. SMS Message");
			System.out.println("2. Email Message");
			System.out.println("3. Whatsapp Meesage");
			System.out.println("Enter your choice");
			choice = scanner.nextInt();
			System.out.println("Enter To : ");
			To = scanner.next();
			MessageText = scanner.nextLine();
			System.out.println("Enter Message Text : ");
			MessageText = scanner.nextLine();
			
			
			
			
			switch (choice) {
			case 1:
			
				message = new SmsMessage();
				break;
			case 2:
				
				message = new EmailMesage();
				break;
			case 3:
				
				message = new WhatsappMessage();
				break;
			default:
				System.out.println("Invalid Choice!");
				break;
			}
			Application application = new Application(message);
			application.processMessage(To, MessageText);
		
		}
	}

