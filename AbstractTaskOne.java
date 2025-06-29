package fom.index;


//Write a Java program to create an interface Shape with the getArea() method. 
//Create three classes Rectangle, Circle, and Triangle that implement the Shape interface.
//Implement the getArea() method for each of the three classes.
interface Shape1{
	public void getArea();
	
}
class Rectangle implements Shape1{
	int length;
	int width;
	Rectangle(int length,int width){
		this.length=length;
		this.width=width;
	}
	
	public void getArea() {
		int area = length * width;
		System.out.println("Area of the rectangle:"+ area);
	}
	
}

class Circus implements Shape1{
	int radius;
	Circus(int radius){
		this.radius=radius;
		
	}
		public void getArea() {
			
			double areaCircle = Math.floor(Math.PI) * radius * radius;
			System.out.println("Area of the Circle: "+areaCircle);
			
		
		
	}
	
}

class Triangle implements Shape1{
	int base;
	int height;
	Triangle(int base,int height){
		this.base = base;
		this.height=height;
	}
	public void getArea() {
		double half=0.5;
		double areaTri = half * base * height;
		System.out.println("Area of the Triangle: "+areaTri);
		
	
	
}
	
}

public class AbstractTaskOne {

	public static void main(String[] args) {
		Shape1 obj = new Rectangle(2,4);
		Shape1 obj1 = new Circus(5);
		Shape1 obj2 = new Triangle(2,4);
		obj.getArea();
		obj1.getArea();
		obj2.getArea();
		

	}

}
