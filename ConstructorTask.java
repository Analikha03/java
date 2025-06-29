package fom.index;

public class ConstructorTask {
	
	String model;
	int year;
	public ConstructorTask(String model,int year) {
		this.model=model;
		this.year=year;
	}
	public void display() {
		System.out.println("model:"+model+" " +"year:"+year);
	}
     
	public static void main(String[] args) {
		ConstructorTask obj=new ConstructorTask("toyota",2003);
		obj.display();
	      

	}

}
