package day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class Test0922 {
	public static void main(String[] args) {
		Collection<String> c = new HashSet<String>();
		
		Collection<String> d = Arrays.asList("one","two");
		Collection<String> e = Collections.singleton("three");
		
		c.add("zero");
		c.addAll(d);
		
		Collection<String> copy = new ArrayList<String>(c);
		
		c.remove("zero");
		c.removeAll(e);
		c.retainAll(d);
		c.clear();
		
		boolean b = c.isEmpty();
		int s = c.size();
		
		c.addAll(copy);
		
		b = c.contains("zero");
		b = c.containsAll(d);
		
		System.out.println(c);
		
		Object [] elements = c.toArray();
		
		String[] strings = c.toArray(new String[c.size()]);
		strings = c.toArray(new String[0]);
		
//		int []a ={1,2,5,3,4};
//		Arrays.sort(a);
//		ArrayList arrayList = new ArrayList<E>();
//		arrayList.addAll(index, copy);
//		Collections.addAll(c, elements);
		
	}
	
	
}
