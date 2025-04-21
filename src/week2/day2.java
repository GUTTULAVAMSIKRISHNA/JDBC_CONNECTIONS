package week2;
class college{
	String collegeName;
	String Address;
	int numOfStudents;
	
	
	public college(String collegeName, String address, int numOfStudents) {
		super();
		this.collegeName = collegeName;
		Address = address;
		this.numOfStudents = numOfStudents;
	}


	public college() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getCollegeName() {
		return collegeName;
	}


	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}


	public int getNumOfStudents() {
		return numOfStudents;
	}


	public void setNumOfStudents(int numOfStudents) {
		this.numOfStudents = numOfStudents;
	}


	void teaching() {
		System.out.println("teaching the concepts");
	}
	
}
class branch extends college{
	
	String branchname;
	int NumOfFaculty;
	public String getBranchname() {
		return branchname;
	}
	public void setBranchname(String branchname) {
		this.branchname = branchname;
	}
	public int getNumOfFaculty() {
		return NumOfFaculty;
	}
	public void setNumOfFaculty(int numOfFaculty) {
		NumOfFaculty = numOfFaculty;
	}
	public branch() {
		super();
		// TODO Auto-generated constructor stub
	}
	public branch(String collegeName, String address, int numOfStudents) {
		super(collegeName, address, numOfStudents);
		// TODO Auto-generated constructor stub
	}
	public branch(String collegeName, String address, int numOfStudents, String branchname, int numOfFaculty) {
		super(collegeName, address, numOfStudents);
		this.branchname = branchname;
		NumOfFaculty = numOfFaculty;
	}
	@Override
	void teaching() {
		System.out.println("teaches the branch knowledge");
	}
	
}

public class day2 {
	public static void main(String[] args) {
		branch b = new branch();
		b.setAddress("rajahmundry"); 
		System.out.println(b.getAddress());
		b.setNumOfStudents(3000); 
		System.out.println(b.getNumOfStudents());
		b.setBranchname("ece");
		System.out.println(b.getBranchname());
		b.setNumOfFaculty(30); 
		System.out.println(b.getNumOfFaculty());
		b.teaching();
	}

}
