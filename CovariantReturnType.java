package javaprograms;
class A{
	A get() {
		return (this);
// System.out.println("hello");
	}
	void message() {
		System.out.println("hello");
	
}
}

class CovariantReturnType extends A{
	CovariantReturnType get() {
		return (this);
// System.out.println("hello");
	}
		void message() {
			System.out.println("hello");
		
	}
	public static void main(String[] args) {
		//B1 b1= new B1(); 
		new A().get().message();

	}

}
