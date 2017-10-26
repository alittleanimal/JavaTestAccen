package day6;

class Person {
	public String nameString = "Parent";
	int age =0;
	public void printName() {
		System.out.println("Person");
	}
}

public class Child extends Person{
	public void printName(){
		System.out.println("Child");
	}
	
	public static void main(String[] args) {
		Person p = new Child();
		p.printName();
	}
}

