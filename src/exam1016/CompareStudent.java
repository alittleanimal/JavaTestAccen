package exam1016;

import java.util.Comparator;

public class CompareStudent implements Comparator<Student> {

	@Override
	public int compare(Student arg0, Student arg1) {
		
		if (arg0.getAge() >arg1.getAge()) {
			return 1;
		}else if (arg0.getAge() == arg1.getAge()) {
			return 0;
		}
		else {
			return -1;
		}
		
	}
	
}
