package com.suyesh.client;

import java.util.Scanner;

import com.suyesh.presentation.Presentation;
import com.suyesh.presentation.PresentationImpl;

public class Client {

	public static void main(String[] args) {
		Presentation employeePresentation=new PresentationImpl();
		Scanner scanner=new Scanner(System.in);
		while(true) {
			employeePresentation.showMenu();
			System.out.println("Enter Choice ");
			int choice=scanner.nextInt();
			employeePresentation.performMenu(choice);
			System.out.println("  ");
			System.out.println("-------------------------------------------------------------------------------------------");
			System.out.println("  ");
		}

	}

}