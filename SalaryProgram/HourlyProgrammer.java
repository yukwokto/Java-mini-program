
public class HourlyProgrammer extends Programmer {
	private double wage; // wage per hour
	private double hours; // hours worked for week

	//constructor
	public HourlyProgrammer(String firstName, String lastName,
			String socialSecurityNumber, int month, int year, 
			double wage, double hours) {
		
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		}

		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}

		this.wage = wage;
		this.hours = hours;
	} 

	// setter for wage
	public void setWage(double wage) {
		if (wage < 0.0) { // validate wage
			throw new IllegalArgumentException(
					"Hourly wage must be >= 0.0");
		}
		this.wage = wage;
	} 

	//getter for wage
	public double getWage() {
		return wage;
	} 

	//setter for hours
	public void setHours(double hours) {
		if ((hours < 0.0) || (hours > 168.0)) { // validate hours
			throw new IllegalArgumentException(
					"Hours worked must be >= 0.0 and <= 168.0");
		}
		this.hours = hours;
	} 

	// getter for hours
	public double getHours() {
		return hours;
	} 

	// implementing abstract method from super class Programmer
	@Override                                                           
	public double getPaymentAmount() {                                            
		if (getHours() <= 40) { // no overtime                           
			return getWage() * getHours();   
		}
		else {                                                             
			return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
		}
	}

	//return String representation of HourlyProgrammer object              
	@Override                                                             
	public String toString() {
		String report = "";
		
		// add the type of programmer to the output of 
		// abstract super class toString() method (name + SSN)
		report = "hourly" + super.toString();
		
		// add hour and wage to the output
		// hourly wage: $18.95; hours worked: 40.00 
		report += String.format("hourly wage: $%.2f; hours worked: %.2f",
							getHours(), getWage());
		
		return report;
	} 
}