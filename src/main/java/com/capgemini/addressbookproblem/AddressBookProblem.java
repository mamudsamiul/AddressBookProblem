package com.capgemini.addressbookproblem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookProblem {
	private static String firstName;
	private static String lastName; 
	private static String address; 
	private static String city; 
	private static String state; 
	private static String zip;
	private static String phoneNo; 
	private static String emailAddress; 
	private static final Logger LOG = LogManager.getLogger(AddressBookProblem.class);
	private static void takingInput()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter your First name :");
		firstName=scan.nextLine();
		System.out.println("Please enter your Last name :");
		lastName=scan.nextLine();
		System.out.println("Please enter your Address :");
		address=scan.nextLine();
		System.out.println("Please enter your City :");
		city=scan.nextLine();
		System.out.println("Please enter your State:");
		state=scan.nextLine();
		System.out.println("Please enter your Zip Code :");
		zip=scan.nextLine();
		System.out.println("Please enter your Phone number :");
		phoneNo=scan.nextLine();
		System.out.println("Please enter your email Address :");
		emailAddress=scan.nextLine();
		LOG.info("All inputs are taken successfully!");
	}
	public static void main(String[] args) {

		System.out.println(": Welcome to the Address Book System :");
		LOG.info("Address book system started");
		ArrayList<String> contactDetails = new ArrayList<String>();
		takingInput();
		contactDetails.add(firstName);
		contactDetails.add(lastName);
		contactDetails.add(address);
		contactDetails.add(city);
		contactDetails.add(state);
		contactDetails.add(zip);
		contactDetails.add(phoneNo);
		contactDetails.add(emailAddress);
		System.out.println("Details are "+contactDetails);
	}
}
