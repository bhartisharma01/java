package javaprograms;
class Address{
	String city, state, country;
	Address(String city, String state, String country){
		this.city=city;
		this.state=state;
		this.country=country;
	}
	
}
class Employee{
	Address address;// agreegation
	int id;
	String name;
	Employee(int id, String name, Address address){
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() {
		System.out.println("Id:" + " " + id);
		System.out.println("name:" + " " + name);
		System.out.println("City:" + " " + address.city);
		System.out.println("State:" + " " + address.state);
		System.out.println("Country:" + " " + address.country);
	}
	
}
public class Aggregation {

	public static void main(String[] args) {
		Address address1=new Address("gzb","UP","india");  
		Address address2=new Address("gno","UP","india");  
		  
		Employee e=new Employee(111,"varun",address1);  
		Employee e2=new Employee(112,"arun",address2);  
		      
		e.display();  
		e2.display(); 

	}

}
