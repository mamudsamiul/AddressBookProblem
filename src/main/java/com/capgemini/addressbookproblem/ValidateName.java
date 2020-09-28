package com.capgemini.addressbookproblem;

import java.util.ArrayList;
import java.util.HashMap;

public class ValidateName {
	private String firstName;
	private String lastName;
	int indexNumber;

	public ValidateName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int check(DataAddToAddressBook obj) {
		HashMap<Integer, ArrayList> data = obj.addressBookOne;
		for (int i : data.keySet()) {
			if (data.get(i).get(0).equals(firstName) && data.get(i).get(1).equals(lastName)) {
				indexNumber = i;
				break;
			} else
				indexNumber = -1;
		}
		return indexNumber;
	}
}
