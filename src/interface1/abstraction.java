package interface1;
abstract class vehicle1 {
	String name;
	abstract void start();
}
class audi extends vehicle1{
	void start() {
		System.out.println("audi is started");
	}
}
public class abstraction {
	public static void main(String[] args) {
		audi a = new audi();
		a.start();
	}

}
