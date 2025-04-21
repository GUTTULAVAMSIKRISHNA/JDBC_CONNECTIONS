package week2;

public class polymorphism {
	
		int addition(int a, int b){
			return a+b;
		}
		int subtraction(int a,int b, int c) {
			return a-b-c;
		}
	
	public static void main(String[] args) {
		polymorphism p = new polymorphism();
		System.out.println(p.addition(3, 4));
		System.out.println(p.subtraction(-9, -14, -2));
	}

}
