package com.capgemini.addressbookproblem;

import java.util.Scanner;

public class InputForValidation {
	static String[] takeData() {
		String[] name = new String[2];
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first name:");
		name[0] = scan.nextLine();
		System.out.println("Enter last name:");
		name[1] = scan.nextLine();
		return name;
	}
}
