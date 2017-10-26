package day2;

public class People {
	private int age = 20;
	private String name = "People";

	public People() {
		// TODO Auto-generated constructor stub
	}

	public People(int age, String name) {
		this.age = age;
		this.name = name;
		System.out.println(age);
		System.out.println(name);
	}
	
	public void eat() {
		System.out.println("Have something to eat!");
	}

	public void drink() {
		System.out.println("Have something to drinkdrink!");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

class Teacher extends People {

	public Teacher() {
		// TODO Auto-generated constructor stub
	}
	public Teacher(int age, String name){
		super(age,name);
	}

	public void eat() {
		System.out.println("Teacher have something to eat");
	}

	public void teach() {
		System.out.println("Teach English.");
	}
	
	public void say() {
		System.out.println(getName());
		System.out.println(getAge());
	}
}

class Student extends People {
	String name = "Student";

	public void eat() {
		System.out.println("Student have something to eat");
	}

	public void drink() {
		System.out.println("Student drink");
	}

	public void study() {
		System.out.println("Study Chinese");
	}
}