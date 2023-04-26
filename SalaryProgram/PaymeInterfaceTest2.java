
public class PaymeInterfaceTest2 {

	public static void main(String[] args) {
		
		// create a Payme array of size 6
		Payme[] paymeArr = new Payme [6];
		
		// Populate the Payme array with different objects
		paymeArr[0] = new Invoice("22776", "brakes", 3, 300);
		paymeArr[1] = new Invoice("33442", "gear", 5, 90.99);
		paymeArr[2] = new SalariedProgrammer("Chioma", "Yu", "345-67-0001", 4, 2023, 320);
		paymeArr[3] = new HourlyProgrammer("Amara", "Yu", "234-56-7770", 6, 2023, 18.95, 40);
		paymeArr[4] = new CommissionProgrammer("Peter", "Yu", "123-45-6999", 8, 2023, 16500, 0.44);
		paymeArr[5] = new BasePlusCommissionProgrammer("Esther", "Yu", "102-34-5888", 9, 2023, 1200, 0.04, 720);

		// print the title of this file
		System.out.println(
				"Payment for Invoices and Programmers are processed polymorphically:\n"); 
		
		// Loop over the Payme array with toString() and getPaymentAmount() using polymorphism
		for (Payme currentPayme : paymeArr) {
			
			// calling toString() method on objects
//			System.out.printf("%s \n", currentPayme.toString()); 
			currentPayme.display();

			if (currentPayme instanceof BasePlusCommissionProgrammer) {
				// Downcast Payme reference to 
				// BasePlusCommissioProgrammer reference, 
				// so that we can use getBaseSalary() method of BasePlusCommissioProgrammer.
				BasePlusCommissionProgrammer programmer = 
						(BasePlusCommissionProgrammer) currentPayme;
				
				// get the original base salary of BasePlusCommissionProgrammer using getBaseSalary()
				double oldBaseSalary = programmer.getBaseSalary();
				
				// get the new base salary of BasePlusCommissionProgrammer by adding 10%
				programmer.setBaseSalary(1.10 * oldBaseSalary);
				
				// print out the new salary
				System.out.printf(
						"new base salary with 10%% increase is: $%,.2f%n",
						programmer.getBaseSalary());

			} 
			
			// call the getPaymentAmount() on different objects, demonstrating polymorphism
			System.out.printf("payment due: $%,.2f%n",currentPayme.getPaymentAmount());
			
			// add a line break
			System.out.println();
		}
	}
}

