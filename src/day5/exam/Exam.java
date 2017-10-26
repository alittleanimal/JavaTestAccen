package day5.exam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Exam {
	public static void main(String[] args) {
		Set<String> nameSet = new HashSet<String>();
		String[] nameStrings = { "Tom", "Jack", "Jane", "Tom", "Mary", "Jane" };

		for (int i = 0; i < nameStrings.length; i++) {
			nameSet.add(nameStrings[i]);
		}

		System.out.println("The names in the HashSet :");
		for (String name : nameSet) {
			System.out.println(name);
		}

		SortedSet<String> sortedName = new TreeSet<String>(nameSet);
		
		List<String> list = new ArrayList<String>(nameSet);
		Collections.sort(list);
		

		System.out.println("The sorted names :");
		for (String sortNameString : list) {
			System.out.println(sortNameString);
		}
	}
}
