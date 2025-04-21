package day2;

import java.util.Scanner;

public class loopproject {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int ch;
		do {
			displayMenu();
			ch = Integer.parseInt(scr.next());
			switch(ch) {
			case 1:
				Addition();
				break;
			case 2:
				subtraction();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("invalid option");
			}
		}while(ch>0);
	}

	private static void subtraction() {
		System.out.println("this is for addition");
		
	}

	private static void Addition() {
		System.out.println("this is for subtraction");
		
	}

	private static void displayMenu() {
		System.out.println("enter your choice");
		System.out.println("\t1.Addition");
		System.out.println("\t2.Subtraction");
	}

}
