package library_main;

import java.util.Scanner;

import library.Book;
import utility.PrintUtil;
import utility.StoreUtil;

public class Library_Main {

	public static void main(String[] args) {

		int choice;
		boolean exit = false;
		Scanner sc = new Scanner(System.in);
		StoreUtil s1 = null;

		while (!exit) {
			System.out.println("***Enter The Choice***");
			System.out.println("*** 1: Create Book Object***");
			System.out.println("*** 2: Create StoreUtil Object ***");
			System.out.println("*** 3: Add Books ***");
			System.out.println("*** 4: Get No of Books ***");
			System.out.println("*** 5: PrintList of Books ***");
			System.out.println("*** 6: Sort Books by Name in Ascending Order ***");
			System.out.println("*** 7: Print Sorted List of Books ***");
			System.out.println("*** 8: Sort Books by Price in Ascending Order ***");
			System.out.println("*** 9: Exit ***");

			choice = sc.nextInt();

			switch (choice) {
			case 1: {
				Book b1 = new Book();
				System.out.println("Book Object Created Successfully");
				break;
			}
			case 2: {
				s1 = new StoreUtil();
				System.out.println("StoreUtil Object Created Successfully");
				break;
			}
			case 3: {
				if (s1 != null) {
					s1.setBook();
				} else {
					System.out.println("StoreUtil object not created yet. Please choose case 2 first.");
				}
				break;
			}
			case 4: {
				if (s1 != null) {
					PrintUtil p1 = new PrintUtil(s1);
					p1.get_no_of_book();
				} else {
					System.out.println("StoreUtil object not created yet. Please choose case 2 first.");
				}
				break;
			}
			case 5: {
				if (s1 != null) {
					PrintUtil p1 = new PrintUtil(s1);
					p1.print_details();
				} else {
					System.out.println("StoreUtil object not created yet. Please choose case 2 first.");
				}
				break;
			}
			case 6: {
				if (s1 != null) {
					s1.sortBooksByName();
				} else {
					System.out.println("StoreUtil object not created yet. Please choose case 2 first.");
				}
				break;
			}
			case 7: {
				if (s1 != null) {
					PrintUtil p1 = new PrintUtil(s1);
					p1.print_details();
				} else {
					System.out.println("StoreUtil object not created yet. Please choose case 2 first.");
				}
				break;
			}
			case 8: {
				if (s1 != null) {
					s1.sortBooksByPrice();
				} else {
					System.out.println("StoreUtil object not created yet. Please choose case 2 first.");
				}
				break;
			}
			case 9: {
				exit = true;
				System.out.println("Exiting...");
				break;
			}
			default: {
				System.out.println("Invalid choice. Please enter a valid option.");
				break;
			}
			}
		}
		sc.close();
	}
}
