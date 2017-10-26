package test1016;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStudent {
	public static void main(String[] args) {
		List<Student> listStudents = new ArrayList<Student>();
		
		listStudents.add( new Student(1,"zhangsan" ,31)); 
		listStudents.add( new Student(2,"lisi" ,30)); 
		listStudents.add( new Student(3,"wangwu" ,35)); 

		Collections.sort(listStudents,new MyCompare());
		
		for (Student student : listStudents) {
			System.out.println(student.toString());
		}
	}
}
