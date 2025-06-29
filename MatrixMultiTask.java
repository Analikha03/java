package fom.index;

public class MatrixMultiTask {

	public static void main(String[] args) {
		int[][]A= {     //2x3
				{2,3,4},
	            {5,6,7}  
	};
		int[][]B= {   //3x2
				{1,2},
				{3,4},
				{5,6},
		};
		
		int[][] result=new int[2][2];
		
		for(int i=0;i<A.length;i++) {
			for(int j=0;j<B[0].length;j++) {
				for(int k=0;k<B.length;k++) {
			  result[i][j] +=A[i][k]*B[k][j];
				}
			}
		}
		System.out.println("the product is:");
		for(int i=0;i<result.length;i++) {
			for(int j=0;i<result[0].length;j++) {
				System.out.println(result[i][j]+" ");
			}
			System.out.println();
		}

}
}
