📄 Description - Exercise Statement
Exercise 1
Create an object hierarchy with three classes: Worker, OnlineWorker, and InPersonWorker.

The Worker class has the attributes name, surname, and pricePerHour. It includes a method calculateSalary() which takes the number of hours worked as a parameter and multiplies it by the hourly price. The child classes should override this method using @Override.

In the Main() method of the Main class, invoke the necessary methods to demonstrate the functionality of the @Override annotation.

For InPersonWorker, the calculateSalary() method will receive the number of hours worked in a month as a parameter. The salary is calculated by multiplying the hours worked by the hourly price, plus a static attribute gasoline that is added to this class.

For OnlineWorker, the calculateSalary() method will receive the number of hours worked in a month as a parameter. The salary is calculated by multiplying the hours worked by the hourly price, plus the flat rate of the Internet plan, which is a constant in the OnlineWorker class.

Exercise 2
Add some deprecated methods to the child classes and use the @Deprecated annotation. Invoke these deprecated methods from an external class and suppress the "deprecated" warnings using the corresponding annotation.

💻 Technologies Used
Java
IDE: IntelliJ IDEA / Eclipse / NetBeans
Git (version control)
📋 Requirements
JDK 8 or higher
Git (for version control)
🛠️ Installation
Clone the repository to your local machine:

bash
Copiar
Editar
git clone https://github.com/yourusername/repositoryname.git
Open the project in your preferred IDE (e.g., IntelliJ IDEA, Eclipse).

▶️ Execution
Navigate to the Main class.
Run the main() method to see the results of invoking the overridden methods and deprecated methods.
🌐 Deployment
For deploying the project to a server or production environment, follow these steps:

Build the Java application into a .jar file.
Use a cloud server or local server to host the application.
🤝 Contributions
Contributions are welcome! To contribute to this project:

Fork the repository.
Create a new branch.
Make your changes.
Submit a pull request with a detailed description of the changes.
