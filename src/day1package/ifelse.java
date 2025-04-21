package day1package;

import java.util.Scanner;

public class ifelse {
public static void main(String[] args) {
	Scanner scr = new Scanner(System.in);
	System.out.println("enter cgpa:");
	double cgpa=scr.nextDouble();
	if(cgpa>=9.0 && cgpa<=10) {
		System.out.println("o grade");
	}else if (cgpa>=8.0&&cgpa<=8.99) {
		System.out.println("A grade");
	}else if (cgpa>=7.0&&cgpa<=7.99) {
		System.out.println("B grade");
	}else if (cgpa>=6.0&&cgpa<=6.99) {
		System.out.println("C grade");
	}else if (cgpa>=5.0&&cgpa<=5.99) {
		System.out.println("D grade");
	}
	else {
		System.out.println("fail");
	}
	scr.close();
}
}
