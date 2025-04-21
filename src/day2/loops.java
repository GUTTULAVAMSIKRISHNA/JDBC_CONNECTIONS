package day2;

import java.util.Scanner;

public class loops {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("number of times to iterate");
		int n = scr.nextInt();
		for(int i=0; i<=n; i++) {
			System.out.println("*");
		}
		scr.close();
	}

}
