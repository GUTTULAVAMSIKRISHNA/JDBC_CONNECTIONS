package day3;

class Dog {
	String Colour;
	String Breed;
	int Age;
	int Height;
	boolean gender;

	void eating() {
		System.out.println("A Dog is eating");
	}

	void drinking() {
		System.out.println("A Dog is drinking");
	}

	void sleeping() {
		System.out.println("A Dog is sleeping");
	}

	void barking() {
		System.out.println("A Dog is barking");
	}
}

public class oopsconcept1 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.Colour = "brown";
		d.Breed = "lab";
		d.Age = 2;
		d.Height = 3;
		d.gender = true;
		System.out.println(d.Colour);
		System.out.println(d.Breed);
		System.out.println(d.Age);
		System.out.println(d.Height);
		System.out.println(d.gender);
		d.eating();
		d.drinking();
		d.sleeping();
		d.barking();
	}
	

}
