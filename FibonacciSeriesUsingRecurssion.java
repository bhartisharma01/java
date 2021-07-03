package javaprograms;
import java.util.Scanner;
public class FibonacciSeriesUsingRecurssion {
	static int firstNum=0,secNum=1,thirdNum=0;
	static void printFibonacci(int count) {
		if(count>0) {
			thirdNum=firstNum+secNum;
			firstNum=secNum;
			secNum=thirdNum;
			System.out.print(" "+thirdNum);
			printFibonacci(count-1);
		}
	}




	public static void main(String[] args) {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter the number of fibonacci series");
		int count=scan.nextInt();
		scan.close();
		System.out.print(firstNum + " " + secNum);
		printFibonacci(count-2);
	}

}
