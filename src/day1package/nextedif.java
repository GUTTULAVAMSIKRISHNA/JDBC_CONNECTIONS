package day1package;

import java.util.Scanner;

public class nextedif {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the height");
		double height = scr.nextDouble();
		System.out.println("enter weight");
		double weight = scr.nextDouble();
		if (height >= 5.0 && height <= 6.5) {
			if(weight >= 50.0 && weight <= 70.0) {
				System.out.println("eligible");
			}
		}else {
			System.out.println("error");
		}
		scr.close();
			
	}

}
