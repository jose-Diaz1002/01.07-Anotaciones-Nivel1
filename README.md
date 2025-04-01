Worker Hierarchy and Deprecated Methods
📄 Description - Exercise Statement
This project consists of two exercises:

Exercise 1
Create a hierarchy of objects with three classes: Worker, OnlineWorker, and OnsiteWorker.

The Worker class has the attributes: name, surname, and hourlyRate. It also includes the calculateSalary() method, which takes the number of hours worked as a parameter and multiplies it by the hourly rate.

The child classes must override this method using the @Override annotation:

Onsite Workers: Their salary calculation includes an additional static attribute called gasoline, added to the final calculation.

Online Workers: Their salary calculation includes a constant representing the flat internet fee, which is added to the final salary.

The main() method should include calls to these methods to demonstrate how the @Override annotation works.

Exercise 2
Add some deprecated methods to the child classes and use the @Deprecated annotation.

Create an external class that calls these deprecated methods while suppressing the warnings using the appropriate annotation.

💻 Technologies Used
Java

Object-Oriented Programming (OOP)

Annotations (@Override, @Deprecated, @SuppressWarnings)

📋 Requirements
Java Development Kit (JDK) 8 or later

A Java IDE such as IntelliJ IDEA or Eclipse

🛠️ Installation
