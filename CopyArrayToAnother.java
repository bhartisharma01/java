package javaprograms;
import java.util.*;
public class CopyArrayToAnother {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the no of elements");
		int n= in.nextInt();
		System.out.println("Enter the elements of an array");
		int array1[]=new int[n];
		int array2[]=new int[n];
		int array3[]=new int[n];
//		taking input from user
		for(int i=0;i<n;i++) {
			 array1[i]=in.nextInt();
		}
		System.arraycopy(array1, 0, array3, 0, n);
//		copy data from array1 to array2
		System.out.println("Elements of Array2");
		for(int j=0;j<n;j++) {
			array2[j]=array1[j];
			
			System.out.print(array2[j] + " ");
		
		}
		System.out.println();
		System.out.println("Elements of Array3");
		for(int j=0;j<n;j++) {
			System.out.print(array3[j] + " ");
		}
		
		
	
	}

}
