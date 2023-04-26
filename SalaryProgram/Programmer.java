
public abstract class Programmer implements Payme {
	
	// field
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
	private int month;
	private int year;

	// constructor
	public Programmer(String first, String last, String ssn, int month, int year) {
		firstName = first;
		lastName = last;
		socialSecurityNumber = ssn;
		
		this.month = month;
		this.year = year;
	}
	
	// return String representation of Programmer object (Name and SSN)
	// sample output: " Programmer: John Wick
	//                 social security number: 345-67-0001"
	// a space is left before " Programmer" so that each subclass can
	// implement their class name by overriding this method.
	@Override
	public String toString() {
		return String.format(" Programmer: %s %s%nsocial security number: %s%n", 
				getFirstName(), getLastName(), getSocialSecurityNumber());
	} 
	
	// implementing the method in the interface
	public abstract double getPaymentAmount();

	
	// getters and setters for this class

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getSocialSecurityNumber() {
		return socialSecurityNumber;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	} 
} 