
public class SalariedProgrammer extends Programmer  {
	private double weeklySalary;

	//constructor
	public SalariedProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, int month, int year, 
			double weeklySalary) {
		super(firstName, lastName, socialSecurityNumber, month, year); 

		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}

		this.weeklySalary = weeklySalary;
	} 

	//set salary
	public void setWeeklySalary(double weeklySalary) {
		if (weeklySalary < 0.0) {
			throw new IllegalArgumentException(
					"Weekly salary must be >= 0.0");
		}
		this.weeklySalary = weeklySalary;
	} 

	//return salary
	public double getWeeklySalary() {
		return weeklySalary;
	} 

	// implementing abstract method from super class Programmer
	@Override                                                           
	public double getPaymentAmount() {                                          
		return getWeeklySalary();                                        
	}                                             

	//return String representation of SalariedProgrammer object 
	@Override        
	public String toString() {
		String report = "";
		
		// add the type of programmer to the output of 
		// abstract super class toString() method (name + SSN)
		report = "salaried" + super.toString();
		
		// add weekly salary to the output
		report += String.format("weekly salary: $%,.2f",
							getWeeklySalary());	
		
		return report;
	} 
}