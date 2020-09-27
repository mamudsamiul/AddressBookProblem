package com.capgemini.addressbookproblem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class AddressBookProblem {
	private static final Logger LOG = LogManager.getLogger(AddressBookProblem.class);

	public static void main(String[] args) {
		int flag;
		System.out.println(": Welcome to the Address Book System :");
		LOG.info("Address book system started");
		DataAddToAddressBook firstEntry = UserInputTaking.read();
		System.out.println(firstEntry.addressBook);
		flag = NameCheckForUpdate.InsertOrUpdate();
		System.out.println(flag);
		switch (flag) {
		case 1:
			Scanner scan = new Scanner(System.in);
			String checkFirstName;
			String checkLastName;
			System.out.println("Enter first name:");
			checkFirstName = scan.nextLine();
			System.out.println("Enter last name:");
			checkLastName = scan.nextLine();
			ValidateName valid = new ValidateName(checkFirstName, checkLastName);
			if (valid.check(firstEntry)) {
				firstEntry = UserInputTaking.read();
				System.out.println(firstEntry.addressBook);
			} else
				System.out.println("Invalid Input!");
			break;
		default:

		}

	}
}
