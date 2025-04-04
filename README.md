📚 01.07 - Annotations - Level 1

📄 Description
This Java project focuses on the use of annotations, particularly @Override and @Deprecated. 
Through object-oriented inheritance, you will learn how to correctly override methods and mark 
legacy methods as deprecated, along with the proper use of annotation-based warning suppression.

📌 Exercises
✅ Exercise 1: Salary Calculation with Inheritance and @Override
Create a class hierarchy with the following structure:

Class Treballador

Attributes: name, surname, hourlyRate

Method: calcularSou(int hoursWorked) → returns hoursWorked * hourlyRate

Subclass TreballadorPresencial

Overrides calcularSou()

Includes a static field benzina

Salary = (hoursWorked * hourlyRate) + benzina

Subclass TreballadorOnline

Overrides calcularSou()

Includes a constant for the flat-rate internet fee

Salary = (hoursWorked * hourlyRate) + INTERNET_FLAT_RATE

From the main() method in the main class, instantiate each type of worker and invoke the overridden 
method to demonstrate how @Override works.

✅ Exercise 2: Deprecated Methods and Suppression
Add some deprecated methods to the child classes.

Use the @Deprecated annotation to mark them.

From an external class, call those deprecated methods.

Use @SuppressWarnings("deprecation") to suppress the warning messages.

💻 Technologies Used
Java 8+

Object-Oriented Programming (OOP)

Annotations: @Override, @Deprecated, @SuppressWarnings

📋 Requirements
JDK 8 or higher

Any Java IDE (IntelliJ IDEA, Eclipse, VS Code, NetBeans, etc.)
