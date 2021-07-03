package javaprograms;
import java.util.Scanner;
public class ArrayUserInput {
static int[] get() {
//	static int arr[]=new int[n];
	Scanner in = new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=in.nextInt();
	int arr[]=new int[n];
	System.out.println("Enter the elements");
	for(int i=0;i<n;i++) {
		arr[i]=in.nextInt();
	}
	for(int i=0;i<n;i++) {
		System.out.println(arr[i]);
	}
	return new int[] {};
}
//static void display() {
//	int n = 0;
//	for(int i=0;i<n;i++) {
//		
//	}
//}
	public static void main(String[] args) {
		
		
		get();
		
	}

}
