package interface1;
interface vehicle {
	void start();
}
class mg implements vehicle {
	public void start() {
		System.out.println("car is starting");
	}
}
public class task1 {
	public static void main(String[] args) {
		mg g = new mg();
		g.start();
	}

}
