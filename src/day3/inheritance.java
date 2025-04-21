package day3;
class Phones {
	String Camera;
	String Colour;
	double Displaylength;
	String Model;
	
	void PlayStore() {
		System.out.println("download your app");
	}
	void Calender() {
		System.out.println("check the dates");
	}
	void Notes() {
		System.out.println("write the notes");
	}
	void Alarm() {
		System.out.println("set the alarm time");
	}
	
}

class Samsung extends Phones {
	String AndroidVersion;
	String processor;
	String Displaytype;
	
	void pen() {
		System.out.println("pen is for notes");
	}
	
}
public class inheritance {
	public static void main(String[] args) {
		Samsung s = new Samsung();
		s.Camera = "sony";
		s.Colour = "blue";
		s.Displaylength = 6.5;
		s.Model = "s24";
		s.AndroidVersion = "14";
		s.processor ="qualcom 720";
		s.Displaytype ="Amoled";
		s.PlayStore();
		s.Calender();
		s.Notes();
		s.Alarm();
		s.pen();
	}

}
