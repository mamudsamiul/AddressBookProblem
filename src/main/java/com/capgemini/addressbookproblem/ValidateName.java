package com.capgemini.addressbookproblem;

public class ValidateName {
	private String firstName;
	private String lastName;

	public ValidateName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public boolean check(DataAddToAddressBook obj) {
		if ((obj.addressBook.get(0).equals(firstName)) && (obj.addressBook.get(1).equals(lastName)))
			return true;
		else
			return false;
	}

}
