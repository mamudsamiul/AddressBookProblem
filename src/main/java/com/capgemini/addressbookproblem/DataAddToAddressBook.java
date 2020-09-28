package com.capgemini.addressbookproblem;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.ArrayList;
import java.util.HashMap;

public class DataAddToAddressBook {
	private static final Logger LOG = LogManager.getLogger(AddressBookProblem.class);
	private String firstName; // a->b
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNo;
	private String emailAddress;
	private static int counter = 0;
	HashMap<Integer, ArrayList> addressBookOne = new HashMap<Integer, ArrayList>();
	ArrayList<String> addressBook;

	public void addUser(String firstName, String lastName, String address, String city, String state, String zip,
			String phoneNo, String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.emailAddress = emailAddress;
	}

	public void data() {
		addressBook = new ArrayList<String>();
		addressBook.add(firstName);
		addressBook.add(lastName);
		addressBook.add(address);
		addressBook.add(city);
		addressBook.add(state);
		addressBook.add(zip);
		addressBook.add(phoneNo);
		addressBook.add(emailAddress);
		addressBookOne.put(counter, addressBook);
		counter++;
	}

	void removeEntry(int indexNumber) {
		addressBookOne.remove(indexNumber);
	}

	void showAddressBook() {
		for (int i : addressBookOne.keySet()) {
			LOG.info("key: " + i + " value: " + addressBookOne.get(i));
		}
	}
}
