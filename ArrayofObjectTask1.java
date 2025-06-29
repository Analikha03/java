package fom.index;
//write a program to print stu details in 5 array of objects ...name,id,location,branch,degree(engg,arts)
//id to be greater than 3
//location north,west,east,south ---south only

/*
class Personnew{
	String name ,location,branch,degree;
	int id;
	Personnew(String name,String location,String branch,String degree,int age){
		this.name=name;
	    this.location=location;
	    this.branch=branch;
	    this.degree=degree;
	    this.id=id;
	}
	void display() {
		if(id>3) {
	System.out.println("name:"+name+",location:"+location+",branch:"+branch+"degree(arts/engg):"+degree+"id:"+id);
	}
}
}
public class ArrayofObjectTask1 {

	public static void main(String[] args) {
		//create an array to hold 3 person objects

		//class[] obj= new className[array or obj size]
		Personnew[] people = new Personnew[4];
		//initialize objects and assign to array
		//obj[size 0]=new classname(var1,var2);		
		people[0]=new Personnew("anu","south","EEE","engg",30);
		people[1]=new Personnew("alice","north","Bcom","arts",31);
		people[2]=new Personnew("charlie","east","CSE","engg",32);
		people[3]=new Personnew("charles","south","ECE","engg",33);
		
		//access array and call the method
		for(int i=0;i<people.length;i++) {
			people[i].display();
		}
	}

}
*/

//1)Write a program to print the student details id,name ,age location branch degree in 5 array of object.
//2) id greater than  3 
//3)you want to give the locatīon --> north west east south --> get only north
//3)degree --> Engineering and arts
class StudentDetails1{
	int stuId;
	String stuName;
	int stuAge;
	String stuLocation;
	String stuDegree;


StudentDetails1(int Id,String Name,int Age,String Location,String Degree){
	
	this.stuId = Id;
	this.stuName = Name;
	this.stuAge = Age;
	this.stuLocation = Location;
	this.stuDegree = Degree;
}
public void studentid() {
	  if(stuId>3) {
		  System.out.println("Student Id: " + stuId + "   Student Name: " + stuName +"   Student Age: " + stuAge +"   Student Location: " + stuLocation +"   Student Degree: " + stuDegree);
	  }
}
public void studentlocation() {
	 if(stuLocation.equalsIgnoreCase("North")) {
		  System.out.println("Student Id: " + stuId + "   Student Name: " + stuName +"   Student Age: " + stuAge +"   Student Location: " + stuLocation +"   Student Degree: " + stuDegree);
	  }
}

public void studentdegree() {
	 if(stuDegree.equalsIgnoreCase("Engineering")) {
		  System.out.println("Student Id: " + stuId + "   Student Name: " + stuName +"   Student Age: " + stuAge +"   Student Location: " + stuLocation +"   Student Degree: " + stuDegree);
	  }
}
}


public class TaskArrayOfObject {

	public static void main(String[] args) {
		StudentDetails1[] student = new StudentDetails1[5];
		student[0] = new StudentDetails1(1,"Saravana",24,"East","Arts");
		student[1] = new StudentDetails1(3,"Devi",21,"North","Engineering");
		student[2] = new StudentDetails1(5,"Hema",20,"North","Engineering");
		student[3] = new StudentDetails1(7,"Saran",22,"North","Arts");
		student[4] = new StudentDetails1(9,"Anaalik",25,"West","Engineering");
		
		System.out.println("------------------Student Details-----------------");
		System.out.println("Students id more than 3 ");
		
		for (int i=0;i<student.length;i++) {
			student[i].studentid();
			}
		System.out.println("North Students ");
		for (int i=0;i<student.length;i++) {
			student[i].studentlocation();
			}
		System.out.println("Engineering Students ");
		for (int i=0;i<student.length;i++) {
			student[i].studentdegree();
			}
			

	}

}