package fom.index;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of first array: ");
		int size=sc.nextInt();
		int[] num=new int[size];
		System.out.println("Enter the elements for array of size: "+size );
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println("The first array is "+Arrays.toString(num));
		System.out.print("Enter the size of second array: ");
		int size1=sc.nextInt();
		int[] num1=new int[size1];
		System.out.println("Enter the elements for array of size: "+size1 );
		for(int i=0;i<num1.length;i++) {
			num1[i]=sc.nextInt();
		}
		System.out.println("The second array is "+Arrays.toString(num1));
		int[] result=Concatenated(num,num1);
		System.out.println("The concatenated array is "+Arrays.toString(result));
	}

	public static int[] Concatenated(int[] a, int[] b) {
		int Size=a.length+b.length;
		int[] result=new int[Size];
		for(int i=0;i<a.length;i++) {
			result[i]=a[i];
		}
		int index=0;
		for(int j=a.length;j<Size;j++) {
			
			if(index<b.length){
				result[j]=b[index];
				index++;
				}
		}
		return result;
	}

}
