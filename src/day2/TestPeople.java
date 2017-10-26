package day2;

public class TestPeople {
	public static void main(String[] args) {
		People people = new People();
		people.eat();
		people.drink();
		people.setName("change People");
		System.out.println(people.getName());

		Teacher teacher = new Teacher();
		teacher.eat();
		teacher.teach();
		Teacher teacher2 = new Teacher(30, "new_teacher");
		teacher2.say();

		/*Student student = new Student();
		student.drink();
		student.study();

		People people2 = new Student();
		people2.eat();
		people2.drink();

		people2 = teacher;
		people2.eat();
		people2.drink();*/

	}
}
