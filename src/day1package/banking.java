package day1package;

import java.util.Scanner;

public class banking {
public static void main(String[] args) {
	Scanner scr = new Scanner (System.in);
	
	int service;
	do {
		
		banking();
		service = scr.nextInt();
		switch (service) {
		case 1:
			withdraw();
			
			break;
		case 2:
			deposit();
			
			break;
		case 3:
			bvalance_enquery();
			
			break;
		case 4:
			statement();
			
			break;
		
		case 5:
			System.exit(0);
			break;
		default :
			System.out.println("invalid service");
			break;
		}
		service ++;

	}while(service >0);
}

private static void banking() {
	
	System.out.println("\t1 withdraw"+"\n"+"\t2 deposit"+"\n"+"\t3 balance enquiry"+"\n"+"\t4 statement");
	System.out.println("choose bank services");
}

private static void statement() {
	System.out.println("enter your account details");
	
}

private static void bvalance_enquery() {
	System.out.println("enter your pin");
	
}

private static void deposit() {
	System.out.println("place the amount in deposit box");
	
}

private static void withdraw() {
	
	System.out.println("enter the amount");
	
}
}
