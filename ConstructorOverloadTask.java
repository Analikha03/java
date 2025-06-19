package fom.index;



	
	public class ConstructorOverloadTask {
		private int id;
		private String name;
		private String designation;

		ConstructorOverloadTask(int a){
			this.id = a;
		}
		ConstructorOverloadTask(int a,String b){
			this.id = a;
			this.name= b;
			
		}
		ConstructorOverloadTask(int a,String b,String c){
			this.id = a;
			this.name= b;
			this.designation=c;
		}

		void display() {
			System.out.println(id + " " + name + " " + designation);
		}
			public static void main(String[] args) {
				ConstructorOverloadTask obj1 = new ConstructorOverloadTask(101);
				ConstructorOverloadTask obj2 = new ConstructorOverloadTask(102,"Analikha");
				ConstructorOverloadTask obj3 = new ConstructorOverloadTask(103,"Rajeswari","Manager");
				obj1.display();
				obj2.display();
				obj3.display();
				
			}

		
	
	}


