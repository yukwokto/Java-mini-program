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

<br />
<br />

# Clock Program
This is a Java program that contains several classes to demonstrate the functionality of different types of clocks.

### ClockDemo
The ClockDemo class tests the functionality of the Clock class by creating a Clock object and calling its methods to retrieve the current hours, minutes, and time.

### ClocksDemo
The ClocksDemo class demonstrates the usage of the Clock, WorldClock, and AlarmClock classes by creating objects of these classes and storing them in an array. The program then iterates through the array and prints the time and class name of each object.

### WorldClock
The WorldClock class represents a world clock that displays the time in a specified timezone. This class extends the Clock class and overrides the getTime method to calculate and return the current time in the specified timezone.

### WorldClockDemo
The WorldClockDemo class demonstrates the usage of the WorldClock class by creating an instance of the class and testing its functionalities.

### AlarmClock
The AlarmClock class extends the Clock class and adds functionality to set an alarm and check whether the current time matches the alarm time. This class uses the LocalTime class from the java.time package.
