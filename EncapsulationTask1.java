package fom.index;
//Write a program to create a class called Bank account private instance var account number and balance 
		//provide public getter and setter method to access and modify the data*/

public class EncapsulationTask1 {

		private int accountNo=1000;
		private int balance=10000;

		public int getAccountNo() {
			return accountNo;
		}
		public void setAccountNo(int acc) {
			this.accountNo=acc;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance=balance;
		}
			public static void main(String[] args) {
				 EncapsulationTask1 obj = new  EncapsulationTask1();
				obj.setAccountNo(1001);
				System.out.println("Account number: " + obj.getAccountNo());
				obj.setBalance(20000);
				System.out.println("Account balance: " + obj.getBalance());


			}

		

	}


