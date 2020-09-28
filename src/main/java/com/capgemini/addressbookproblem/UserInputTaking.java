package com.capgemini.addressbookproblem;

import java.util.Scanner;

public class UserInputTaking {
	static String firstName;
	static String lastName;
	static String address;
	static String city;
	static String state;
	static String zip;
	static String phoneNo;
	static String emailAddress;
	static DataAddToAddressBook dataEntry = new DataAddToAddressBook();

	public static DataAddToAddressBook read() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your First name :");
		firstName = scan.nextLine();
		System.out.println("Please enter your Last name :");
		lastName = scan.nextLine();
		System.out.println("Please enter your Address :");
		address = scan.nextLine();
		System.out.println("Please enter your City :");
		city = scan.nextLine();
		System.out.println("Please enter your State:");
		state = scan.nextLine();
		System.out.println("Please enter your Zip Code :");
		zip = scan.nextLine();
		System.out.println("Please enter your Phone number :");
		phoneNo = scan.nextLine();
		System.out.println("Please enter your email Address :");
		emailAddress = scan.nextLine();
		dataEntry.addUser(firstName, lastName, address, city, state, zip, phoneNo, emailAddress);
		dataEntry.data();
		dataEntry.showAddressBook();
		return dataEntry;
	}
}
