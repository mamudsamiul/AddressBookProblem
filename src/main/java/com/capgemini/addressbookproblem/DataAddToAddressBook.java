package com.capgemini.addressbookproblem;

import java.util.ArrayList;

public class DataAddToAddressBook {
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNo;
	private String emailAddress;

	public DataAddToAddressBook(String firstName, String lastName, String address, String city, String state,
			String zip, String phoneNo, String emailAddress) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.emailAddress = emailAddress;
	}

	public ArrayList<String> data() {
		ArrayList<String> addressBook = new ArrayList<String>();
		addressBook.add(firstName);
		addressBook.add(lastName);
		addressBook.add(address);
		addressBook.add(city);
		addressBook.add(state);
		addressBook.add(zip);
		addressBook.add(phoneNo);
		addressBook.add(emailAddress);
		return addressBook;
	}
}
