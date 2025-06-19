package fom.index;

/*task

write a program  using encapsulation that binds employee id ,employee name, employee location  
the variable can be accessed within the same class using get and set 

write a program to create a class called bank account with private instance variable account number and balannce
provide public getter and setter method to access and modify the data
*/


public class EncapsulationTask {

	    private int id;
		private String name;//private member variable
		private String location;
		
		public int getId(){ // access data
			return id;
		}
		public String getName(){ // access data
			return name;
		}
		public String getLocation(){ // access data
			return location;
		}
		
		public void setId(int id) { //modify data
	      this.id=id;
		
	}
		public void setName(String name) { //modify data
		      this.name=name;
			
		}
		public void setLocation(String location) { //modify data
		      this.location=location;
			
		}
		public static void main(String[] args) {
			EncapsulationTask obj1=new EncapsulationTask();
					obj1.setId(1);
							System.out.println(obj1.getId());
							
		     EncapsulationTask obj=new EncapsulationTask();
			   obj.setName("santhosh");
				System.out.println(obj.getName());
				
				EncapsulationTask obj3=new EncapsulationTask();
				obj3.setLocation("chennai");
						System.out.println(obj3.getLocation());

		}
	}


