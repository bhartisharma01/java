package javaprograms;
import java.util.*;
import java.io.*;
public class FibonacciSeries {
	
	public static void main(String[] args) {
		int firstNum=0, secondNum=1,thirdNum=0;
		System.out.println("Enter the number of fibonacci series");
		Scanner scan = new Scanner(System.in);
		int totalFib=scan.nextInt();
		System.out.print(firstNum + " " + secondNum);
		for(int i=2;i<=totalFib;i++) {
			
			thirdNum=firstNum+secondNum;
			firstNum=secondNum;
			secondNum=thirdNum;
			System.out.print(" " + thirdNum);
			
		}
		scan.close();
	}
}
