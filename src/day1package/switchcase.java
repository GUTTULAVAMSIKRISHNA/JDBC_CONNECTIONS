package day1package;

import java.util.Scanner;

public class switchcase {
public static void main(String[] args) {
	Scanner scr = new Scanner (System.in);
	displaymenu(); 
	System.out.println("choose a vote:");
	int vote = scr.nextInt();
	switch(vote) {
	case 1:
		System.out.println("janasena party");
		break;
	case 2:
		System.out.println("ysrcp party");
		break;
	case 3:
		System.out.println("tdp party");
		break;
	case 4:
		System.out.println("bjp party");
		break;
	case 5:
		System.out.println("congress party");
		break;
		default:
			System.out.println( "incorrect option");
			break;
	}
	scr.close();
}


private static void displaymenu() {
	// TODO Auto-generated method stub
	
}
}
