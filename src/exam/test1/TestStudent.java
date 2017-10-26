package exam.test1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		Student student1 = new Student(1001, "test1", 1, 20, 85);
		Student student2 = new Student(1002, "test2", 1, 24, 95);
		Student student3 = new Student(1003, "test3", 1, 23, 75);
		Student student4 = new Student(1004, "test4", 0, 18, 65);
		Student student5 = new Student(1005, "test5", 0, 20, 85);
		
//		System.out.println(student1);
//		System.out.println(student2);
//		System.out.println(student3);
//		System.out.println(student4);
//		System.out.println(student5);
		
		List<Student> studentList = new ArrayList<Student>();
		studentList.add(student1);
		studentList.add(student2);
		studentList.add(student3);
		studentList.add(student4);
		studentList.add(student5);
		List<Integer> grade = new ArrayList<Integer>();
		
		for (Student student : studentList) {
			System.out.println(student);
			grade.add(student.getsJava());
		}
		System.out.println("Java max is : " + Collections.max(grade));
		System.out.println("Java min is : " + Collections.min(grade));
		int sum = 0;
		for (Integer integer : grade) {
			sum+=integer;
		}
		System.out.println("average: " + sum/5);
		
	}
}
