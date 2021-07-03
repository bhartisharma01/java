package javaprograms;
import java.util.Scanner;
class Student{
	String name;
	int id;
}
public class ObjectOriented {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		Student s1= new Student();
		System.out.println("ENter the name of the student");
		s1.name=in.nextLine();
		System.out.println("ENter the id of the student");
		s1.id=in.nextInt();
		in.close();
		System.out.println("The id of the student is " + s1.id);
		System.out.println("The name of the student is " + s1.name);

	}

}
