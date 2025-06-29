package fom.index;



//   arrayof object -is a data structure that stores references to multiple object on the same class
//create the object of the class and assign them to the element of the array 
//each element in  the array holds an object
//it can be accessed using their index
  
// ----------------
//define a simple person class
class Personnew{
	String name;
	int age;
	Personnew(String name,int age){
		this.name=name;
		this.age=age;
	}
	void display() {
	System.out.println(name +"is" +age+"years old.");
	}
}
public class ArrayOfObjectExample {

	public static void main(String[] args) {
		//create an array to hold 3 person objects

		//class[] obj= new className[array or obj size]
		Personnew[] people = new Personnew[4];
		//initialize objects and assign to array
		//obj[size 0]=new classname(var1,var2);
		people[0]=new Personnew("bob",30);
		people[1]=new Personnew("alice",35);
		people[2]=new Personnew("charlie",40);
		people[3]=new Personnew("charles",30);
		
		//access array and call the method
		for(int i=0;i<people.length;i++) {
			people[i].display();
		}
	}

}



//write a program to print stu details in 5 array of objects ...name,id,location,branch,degree(engg,arts)
//id to be greater than 3
//location north,west,east,south ---south only
