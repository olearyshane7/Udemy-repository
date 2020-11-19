package OOP;

class Person{
	
	String name;
	String email;
	String phone;
	
	void walk() {
		System.out.println(name);
	}
	
	void sleep() {
		System.out.println(email);
	}
	void eat() {
		System.out.println("johns phone is " + phone);
	}
}

public class demo {

	public static void main(String[] args) {
		Person person1 = new Person();
		
		person1.name = "john";
		person1.email = "john@gmai";
		person1.phone = "21414114";
		
		person1.walk();
		person1.sleep();
		person1.eat();
		

	}

}
