package com.capgemini.addressbookproblem;

import java.util.Scanner;

public class NameCheckForUpdate {
	static int InsertOrUpdate() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Write 'Insert' for insert or write 'Update' for updating:");
		String choice = scan.nextLine();
		if (choice.equals("Insert"))
			return 2;
		else if (choice.equals("Update"))
			return 1;
		else
			return 0;
	}
}
