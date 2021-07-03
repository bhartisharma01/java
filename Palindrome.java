package javaprograms;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the string");
		String original=in.nextLine();
		in.close();
		String  reverse="";
		int length=original.length();
		for(int i=length-1;i>=0;i--) {
			reverse+=original.charAt(i);
		}
		if(original.equals(reverse)) {
			System.out.println("The string is palindrome");
		}
		else
			System.out.println("String is not palindrom");

	}

}
