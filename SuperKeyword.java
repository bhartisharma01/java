package javaprograms;
class Animal {
	void eat() {
		System.out.println("eating");
	}
}
class Dog extends Animal{
	void dance() {
		System.out.println("dancing");
	}
	void eat() {
		System.out.println("dog is eating");
		
	}
	void bark() {
		System.out.println("barkuing");
	}
	void work() {
		super.eat();
		bark();
	}
	
}
public class SuperKeyword {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.eat();
		d.dance();
		d.work();

	}

}
