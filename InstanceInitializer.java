package javaprograms;
class A1{
	A1(){
		System.out.println("constructor A");
		
	}
	{
		int a=100;
		System.out.println(a + "value of a");
		System.out.println("constrctor A instance initializer ");}
}
class B2 extends A1{
	B2(){
//		System.out.println("accesung instance initializer" + (super.a));
		System.out.println("comstructor B2");
		
	}
}
public class InstanceInitializer {

	public static void main(String[] args) {
		B2 b = new B2();

	}

}
