package own.naukri.StreamFiltering;

public class Student {
	
	Integer rollNumber;
	String firstName;
	String lastName;
	
	Student(){
		
	}
	
	Student(Integer rn, String fn, String ln){
		this.rollNumber = rn;
		this.firstName = fn;
		this.lastName = ln;
	}

	public Integer getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(Integer rollNumber) {
		this.rollNumber = rollNumber;
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

	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
}
