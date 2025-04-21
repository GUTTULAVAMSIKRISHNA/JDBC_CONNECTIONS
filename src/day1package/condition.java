package day1package;

import java.util.Scanner;

public class condition {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("enter uswr age");
		int age = src.nextInt();
		if(age > 18 && age <= 120) {
			System.out.println("eligible for pan card");
		}else{
			System.out.println("not eligible");
		}
		src.close();
	}

}
