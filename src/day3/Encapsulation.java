package day3;
class Student {
	private String Rollnum;
	private String StudentName;
	private String StudentEmail;
	private String StudentPassword;
	 public void setRollnums(String rollnum) {
		 this.Rollnum = rollnum;
	 }
	public String getRollnum() {
		return Rollnum;
	}
	public void setRollnum(String rollnum) {
		Rollnum = rollnum;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentEmail() {
		return StudentEmail;
	}
	public void setStudentEmail(String studentEmail) {
		StudentEmail = studentEmail;
	}
	public String getStudentPassword() {
		return StudentPassword;
	}
	public void setStudentPassword(String studentPassword) {
		StudentPassword = studentPassword;
		
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String rollnum, String studentName, String studentEmail, String studentPassword) {
		super();
		Rollnum = rollnum;
		StudentName = studentName;
		StudentEmail = studentEmail;
		StudentPassword = studentPassword;
	}
	 
	
}
public class Encapsulation {
	public static void main(String[] args) {
		Student s = new Student();
		s.setRollnum("101");
		System.out.println(s.getRollnum());
		s.setStudentName("krishna");
		System.out.println(s.getStudentName());
		s.setStudentEmail("student@gmail.com");
		System.out.println(s.getStudentEmail());
		s.setStudentPassword("qwert1234");
		System.out.println(s.getStudentPassword());
	}
	

}
