package javaprograms;
import java.util.*;
class Stu{  
	 int rollno;  
	 String name;  
	 void insertRecord(int r, String n){ 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter id and name");
		r=in.nextInt();
		
		
		n= in.nextLine();
		rollno=r;
		name=n;

				
	 
	 }  
	 void displayInformation(){System.out.println(rollno+" "+name);}  
		
	}  
	class ObjectUsingMethod{  
	 public static void main(String args[]){  
		 Stu s1=new Stu();  
		 Stu s2=new Stu();  
	  s1.insertRecord(s1.rollno,s1.name);  
	  s2.insertRecord(s2.rollno,s2.name);
	  s1.displayInformation();  
  s2.displayInformation();  

	 } 
		
	}  