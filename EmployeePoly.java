package fom.index;

//Base class Employee
class EmployeePoly {
 private String name;
 private int age;
 private double salary;

 public EmployeePoly(String name, int age, double salary) {
     this.name = name;
     this.age = age;
     this.salary = salary;
 }

 public void displayDetails() {
     System.out.println("Employee Details:");
     System.out.println("Name: " + name);
     System.out.println("Age: " + age);
     System.out.println("Salary: $" + salary);
 }
}

//Subclass Manager
class Manager extends EmployeePoly {
 private double bonus;

 public Manager(String name, int age, double salary, double bonus) {
     super(name, age, salary);
     this.bonus = bonus;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Bonus: $" + bonus);
 }
}

//Subclass Developer
class Developer extends EmployeePoly {
 private String programmingLanguage;

 public Developer(String name, int age, double salary, String programmingLanguage) {
     super(name, age, salary);
     this.programmingLanguage = programmingLanguage;
 }

 @Override
 public void displayDetails() {
     super.displayDetails();
     System.out.println("Programming Language: " + programmingLanguage);
 }
}

//Main class to test polymorphism
public class main {
 public static void main(String[] args) {
     EmployeePoly emp1 = new Manager("Alice", 35, 80000, 5000);
     EmployeePoly emp2 = new Developer("Bob", 28, 60000, "Java");

     emp1.displayDetails();
     System.out.println();
     emp2.displayDetails();
 }
}
