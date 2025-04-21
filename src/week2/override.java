package week2;
class instrument{
	String name;
	int length;
	
	void sound() {
		System.out.println("sound of the instrument");
	}
}

class flute extends instrument {
	@Override
	void sound() {
		System.out.println("flute tunes");
	}
}

public class override {
	public static void main(String[] args) {
		flute f = new flute();
		f.name = "flute";
		f.length = 16;
		f.sound();
	}

}
