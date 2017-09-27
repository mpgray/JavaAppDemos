package students;
//A bunch of getters and setters and the 
public class student {
	private String firstName;
	private String lastName;
	//Set a beginning value of Student number
	private int sNumber = 1010100;
	private String major;
	private double gpa;
	static int count = 0;
	
	public student(String fName, String lName, String maj, double myGpa){
		firstName = fName;
		lastName = lName;
		major = maj;
		gpa = myGpa;
		sNumber = sNumber + count++;
		return;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getsNumber() {
		return sNumber;
	}

}
