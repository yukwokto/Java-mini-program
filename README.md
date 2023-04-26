# Java mini-programs

# 1.Salary Program

This is a payroll program that calculates the payment amount for programmers. The program consists of 1 abstract class, 1 interface, and 5 concrete classes:

### Invoice class: 
a class that implements the Payme interface and represents an invoice with the partNumber, partDescription, quantity, and pricePerItem attributes. The getPaymentAmount() method calculates the total cost of the invoice.

### CommissionProgrammer class: 
a class that extends the Programmer class and represents a commission-based programmer with the grossSales and commissionRate attributes. The getPaymentAmount() method calculates the commission-based payment amount.

### Payme Interface
The Payme interface declares the getPaymentAmount() method and a default display() method. The getPaymentAmount() method calculates the payment amount for an object. The display() method uses the toString() method to display the string representation of an object.

### Invoice Class
The Invoice class implements the Payme interface and represents an invoice with the partNumber, partDescription, quantity, and pricePerItem attributes. The getPaymentAmount() method calculates the total cost of the invoice by multiplying the quantity and pricePerItem attributes.

### CommissionProgrammer Class
The CommissionProgrammer class extends the Programmer class and represents a commission-based programmer with the grossSales and commissionRate attributes. The getPaymentAmount() method calculates the commission-based payment amount by multiplying the grossSales and commissionRate attributes.

### BasePlusCommissionProgrammer Class
The BasePlusCommissionProgrammer class extends the CommissionProgrammer class and represents a base-salary plus commission-based programmer with the baseSalary attribute. The getPaymentAmount() method calculates the payment amount by adding the baseSalary and the commission-based payment amount calculated by the CommissionProgrammer class.

### Programmer Class
The Programmer class is an abstract class that declares the firstName, lastName, socialSecurityNumber, birthDate, and hireDate attributes and provides their respective getter and setter methods. The getPaymentAmount() method is also declared as an abstract method. This class is extended by the CommissionProgrammer and BasePlusCommissionProgrammer classes.

