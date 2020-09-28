package com.capgemini.addressbookproblem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Scanner;

public class AddressBookProblem {
	String data[];
	private static final Logger LOG = LogManager.getLogger(AddressBookProblem.class);

	public static void main(String[] args) {
		int flag;
		int indexNumber;
		System.out.println(": Welcome to the Address Book System :");
		LOG.info("Address book system started");
		DataAddToAddressBook firstEntry;
		firstEntry = UserInputTaking.read();
		UserInputTaking.read();
		while (true) {
			flag = NameCheckForUpdate.InsertOrUpdate();
			System.out.println(flag);
			switch (flag) {
			case 1:
				UserInputTaking.read();
				firstEntry.showAddressBook();
				break;
			case 2:
				String dataUpdate[] = InputForValidation.takeData();
				ValidateName valid = new ValidateName(dataUpdate[0], dataUpdate[1]);
				indexNumber = valid.check(firstEntry);
				if (indexNumber == -1)
					System.out.println("Invalid!");
				else {
					firstEntry.removeEntry(indexNumber);
					UserInputTaking.read();
					firstEntry.showAddressBook();
				}
				break;
			case 3:
				String dataDelete[] = InputForValidation.takeData();
				ValidateName validDelete = new ValidateName(dataDelete[0], dataDelete[1]);
				indexNumber = validDelete.check(firstEntry);
				if (indexNumber == -1)
					System.out.println("Invalid!");
				else {
					System.out.println(indexNumber);
					firstEntry.removeEntry(indexNumber);
				}
				break;
			case 4:
				firstEntry.showAddressBook();
				break;
			default:
			}
		}
	}
}
