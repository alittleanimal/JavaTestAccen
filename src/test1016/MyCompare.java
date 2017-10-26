package test1016;

import java.util.Comparator;

public class MyCompare implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if (o1.getAge() > o2.getAge()) {
			return 1;
		}else if (o1.getAge() == o2.getAge()) {
			return 0;
		}else {
			return -1;
		}
	}
	
}
