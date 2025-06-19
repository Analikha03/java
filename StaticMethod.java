package fom.index;

public class StaticMethod {
	

		
		static int a = 20;
		static int b= 10;
		static int c;
		public int add() {
			c = a+b;
			return c;
		}

		static double divide() {
			c = a/b;
			return c;
		}
		public int multiple() {
			c = a*b;
			return c;
			
			
		}

			public static void main(String[] args) {
				StaticMethod obj = new StaticMethod();
				System.out.println(obj.add());
				System.out.println(obj.multiple());
				System.out.println(divide());

			}

		

	
	}


