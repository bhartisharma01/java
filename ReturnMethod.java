package javaprograms;

public class ReturnMethod {

public static int Sum (int a, int b) {
	int sum=a+b;
	return sum;
//	System.out.println("The sum is" + sum);
}

	public static void main(String[] args) {
		int n1=13;
		int n2=45;
int c=Sum(n1,n2);
System.out.println("The sum is" + c);

	}

}
