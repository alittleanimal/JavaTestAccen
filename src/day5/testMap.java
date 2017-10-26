package day5;

import java.awt.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class testMap {
	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<String, Integer>();
		
		Map<String, Integer> singleton = Collections.singletonMap("test", -1);
		
		Map<String, Integer> empty = Collections.emptyMap();
		
		// 使用put()方法填充映射，把数组中的元素映射到元素的索引上
		String[] words = { "this", "is", "a", "test" };
		for(int i = 0; i < words.length; i++) {
			m.put(words[i], i); // 注意，int会自动装包成Integer
		}
		for (int i = 0; i < words.length; i++) {
			m.put(words[i].toUpperCase(), i);
		}
		
		String s1 = "AB";
		String s2 = "CD";
		String s3 = s1;
		System.out.println(s1 == s3); // 是不是同一个对象？
		s3 = s1 + s2;
		System.out.println(s1 == s3); // 还是不是同一个对象？
		System.out.println(s1);
		System.out.println(s3);
		
//		System.out.println(m.containsKey(words[0]));
//		System.out.println(m.containsValue(words.length));
		
		Set<String> keysSet = m.keySet();
		Collection<Integer> values = m.values();
		Set<Map.Entry<String, Integer>> entries = m.entrySet();
		
		SortedSet<String> set = new TreeSet<String>(keysSet);
		for (String word : set) {
			System.out.println(word);
		}
		/*System.out.println(keysSet);
		testSortedSet(words);*/
		
		java.util.List<String> l = Arrays.asList(words);
		java.util.List<String> p = new ArrayList<String>(l);
		
		/*Object[] members = l.toArray();
		String[] c = l.toArray(new String[0]);
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}*/
		
//		String[] input = { "tiger", "cat", "TIGER", "Tiger", "leopard" };
//		java.util.List<String> cats = Arrays.asList(input);
//		String search = "tiger";
//		String tigers = cats.stream().filter(s -> s.equalsIgnoreCase(search))
//				.collect(Collectors.joining(", "));
//		System.out.println(tigers);
		
		String petString = "cat";
		StringBuilder stringBuilder = new StringBuilder(petString);
		stringBuilder.append("aaa");
		System.out.println(stringBuilder);
		
	}
	
	public static void testSortedSet(String[] args) {
		SortedSet<String> s = new TreeSet<String>(Arrays.asList(args));

		for(String word:s){
			System.out.println(word);
		}
		
		String first = s.first();
		String last = s.last();
		
		SortedSet<String> tail = s.tailSet(first + '\0');
		System.out.println(tail);
		
		SortedSet<String> head = s.headSet(last);
		System.out.println(head);
	}
}
