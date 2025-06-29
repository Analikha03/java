package fom.index;
abstract class Employee2{
	abstract void calculateSalary();
	abstract void displayInfo();
}

class Manager2 extends Employee2{
	void calculateSalary() {
		System.out.println("Salary is above 80,000");
	}
	void displayInfo() {
		System.out.println("Manager Salary is high");
	}
}

class Programmer extends Employee2{
	void calculateSalary() {
		System.out.println("Salary is above 35,000 to 45,000");
	}
	void displayInfo() {
		System.out.println("Programmer Salary is Average");
	}
}

public class AbstractClassEmp {
	public static void main(String[] args) {
		Manager2 mng=new Manager2();
		Programmer prg=new Programmer();
		mng.calculateSalary();
		mng.displayInfo();
		prg.calculateSalary();
		prg.displayInfo();
	}

}