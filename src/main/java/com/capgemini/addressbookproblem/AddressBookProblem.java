package com.capgemini.addressbookproblem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookProblem {
	private static final Logger LOG = LogManager.getLogger(AddressBookProblem.class);

	public static void main(String[] args) {
		String firstName;
		String lastName;
		String address;
		String city;
		String state;
		String zip;
		String phoneNo;
		String emailAddress;
		System.out.println(": Welcome to the Address Book System :");
		LOG.info("Address book system started");
		ArrayList<String> show;
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
		scan.close();
		DataAddToAddressBook firstEntry = new DataAddToAddressBook(firstName, lastName, address, city, state, zip,
				phoneNo, emailAddress);
		show = firstEntry.data();
		System.out.println(show);
	}
}
