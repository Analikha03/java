package fom.index;


	//Write a Java program to create a class called Circle with a private 
	//instance variable radius. Provide public getter and setter methods to 
	//access and modify the radius variable. However, provide two methods called calculateArea()
	//and calculatePerimeter() that return the calculated area 
	//and perimeter based on the current radius value
	public class  EncapsulationTask2  {
	private int radius;

	public int getRadius() {
		return radius;
	}
	public void setRadius(int r) {
		this.radius=r;
	}

	public double calculateArea() {
		return 3.14 * radius * radius;
	}
	public double calculatePerimeter() {
		return 2 * 3.14 * radius;
	}
		public static void main(String[] args) {
			 EncapsulationTask2 obj=new  EncapsulationTask2();
			obj.setRadius(5);
			System.out.println("Radius is: " +obj.getRadius());
			System.out.println("Area of circle: " +obj.calculateArea());
			System.out.println("Perimeter of circle: " +obj.calculatePerimeter());
					

		}

	}

