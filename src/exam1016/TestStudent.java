package exam1016;

import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;




public class TestStudent {

	public static void main(String[] args) {
		List<Student> listStudents = new ArrayList<Student>();
		
		listStudents.add( new Student(1,"zhangsan" ,27)); 
		listStudents.add( new Student(2,"lisi" ,30)); 
		listStudents.add( new Student(3,"wangwu" ,35)); 
		listStudents.add( new Student(4,"xiaomin" ,28)); 

		Collections.sort(listStudents,new CompareStudent());
		
		for (Student student : listStudents) {
			System.out.println(student.toString());
		}
	}
}
