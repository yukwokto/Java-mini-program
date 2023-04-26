
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 

	private double baseSalary; // base salary per week

	//constructor
	public BasePlusCommissionProgrammer(String firstName, String lastName, 
			String socialSecurityNumber, int month, int year, 
			double grossSales, double commissionRate, double baseSalary) {
		
		super(firstName, lastName, socialSecurityNumber, 
				month, year, grossSales, commissionRate);

		if (baseSalary < 0.0) { // validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}

		this.baseSalary = baseSalary;                
	}

	//set base salary
	public void setBaseSalary(double baseSalary) {
		if (baseSalary < 0.0) { // validate baseSalary                  
			throw new IllegalArgumentException("Base salary must be >= 0.0");
		}
		this.baseSalary = baseSalary;                
	} 

	// return base salary
	public double getBaseSalary() {
		return baseSalary;
	}
	
	// implementing method from super class CommissionProgrammer
	@Override                                                            
	public double getPaymentAmount() {                                             
		return getBaseSalary() + super.getPaymentAmount();                        
	} 

	//return String representation of BasePlusCommissionProgrammer object
	@Override     
	public String toString() {
		String report = "";
		
		// add the type of programmer to the output of 
		// super super class toString() method (name + SSN)
		report = "base-plus commission" + super.ProgrammerToString();
		
		// add gross sales, commission rate, and base salary to the output
		report += String.format("gross sales: $%.2f; commission rate: %.2f; base salary: $%.2f",
							getGrossSales(), getCommissionRate(), getBaseSalary());
		
		return report;
	} 
}