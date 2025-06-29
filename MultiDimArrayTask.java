package fom.index;

import java.util.Scanner;

public class MultiDimArrayTask {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] matrix1 =new int[2][2];
		int[][] matrix2 =new int[2][2];
		int[][] sum =new int[2][2];
		
		//getting input from the user 1
		System.out.println("Enter the elements of first  2x2 array");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("matrix1[" +i+ "][" +j+"]: ");
				matrix1[i][j] = scanner.nextInt();
			}
		}
		// input for second matrix
          System.out.println("Enter the elements of second  2x2 array");
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				System.out.println("matrix" +i+ "][" +j+"]: ");
				matrix2[i][j] = scanner.nextInt();
			}
		}
		// adding the matrices
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				sum[i][j] =matrix1[i][j] + matrix2[i][j];
			}
		}
		
		//printing the result
		System.out.println("sum of the two matrices::");
		for(int i=0; i<2;i++) {
			for (int j=0; j<2;j++) {
				System.out.print(sum[i][j]+ " "); //as such
			}
			System.out.println(); 
		}
		
		scanner.close();
	}
}
