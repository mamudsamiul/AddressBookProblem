package com.capgemini.addressbookproblem;

import java.util.Scanner;

public class NameCheckForUpdate {
	static int InsertOrUpdate() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Write Insert/Update/Delete/Show");
		String choice = scan.nextLine();
		int choosenData;
		switch (choice) {
		case "Insert":
			choosenData = 1;
			break;
		case "Update":
			choosenData = 2;
			break;
		case "Delete":
			choosenData = 3;
			break;
		case "Show":
			choosenData = 4;
			break;
		default:
			choosenData = 0;
		}
		return choosenData;
	}
}
