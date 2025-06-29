package fom.index;

public class SquarePatternArray {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<n;i++) {   //row  //outerloop
			for(int j=0;j<n;j++) {   //column  //inner loop or  nested loop
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
