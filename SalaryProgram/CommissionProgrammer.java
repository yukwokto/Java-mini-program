
public class CommissionProgrammer extends Programmer { 

	private double grossSales; // gross weekly sales
	private double commissionRate; // commission percentage

	//constructor
	public CommissionProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, int month, int year, 
			double grossSales, double commissionRate) {
		
		super(firstName, lastName, socialSecurityNumber, month, year);

		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}

		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}

		this.grossSales = grossSales;
		this.commissionRate = commissionRate;
	} 

	//set gross sales amount on the creation of apps
	public void setGrossSales(double grossSales) {
		if (grossSales < 0.0) { // validate
			throw new IllegalArgumentException("Gross sales must be >= 0.0");
		}
		this.grossSales = grossSales;
	} 

	//return gross sales amount 
	public double getGrossSales() {
		return grossSales;
	} 

	//set commission rate
	public void setCommissionRate(double commissionRate) {
		if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
			throw new IllegalArgumentException(
					"Commission rate must be > 0.0 and < 1.0");
		}
		this.commissionRate = commissionRate;
	} 

	//return commission rate
	public double getCommissionRate() {
		return commissionRate;
	} 

	// implementing abstract methods from super class Programmer
	@Override                                                           
	public double getPaymentAmount() {                                            
		return getCommissionRate() * getGrossSales();                    
	}                                             

	// implementing abstract methods from super class Programmer
	@Override      
	public String toString() {
		String report = "";
		
		// add the type of programmer to the output of 
		// abstract super class toString() method (name + SSN)
		report = "commission" + super.toString();
		
		// add gross sales and commission rate to the output
		// gross sales: $16,500.00; commission rate: 0.44 
		report += String.format("gross sales: $%.2f; commission rate: %.2f",
							getGrossSales(), getCommissionRate());
		
		return report;
	} 
	
	// calling Programmer toString() method for subclass of this class,
	// so that subclass can overide superbase class for string formatting.
	public String ProgrammerToString() {
		return super.toString();
	}
}