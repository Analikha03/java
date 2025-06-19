package fom.index;

public class EncapsulationTask4 {
	private int id;
	private String name;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id=id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}

    public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary=salary;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EncapsulationTask4 obj=new EncapsulationTask4();
		EncapsulationTask4 obj1=new EncapsulationTask4();
		EncapsulationTask4 obj2=new EncapsulationTask4();
			obj.setId(3);
			obj1.setName("anu");
			obj2.setSalary(50000);
			System.out.println(obj.getId());
			System.out.println(obj1.getName());
			System.out.println(obj2.getSalary());
		}
	}


