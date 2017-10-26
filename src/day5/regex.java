package day5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex {
	public static void main(String[] args) {
		Pattern p = Pattern.compile("honou?r");
//		String aString = "aaa.bbb.ccc";
//		String[] bString = aString.split("\\.");
//		for (int i = 0; i < bString.length; i++) {
//			System.out.println(bString[i]);
//		}
		String caesarUK = "For Brutus is an honourable man";
		Matcher mUK = p.matcher(caesarUK);
		
		String caesarUS = "For Brutus is an honorable man";
		Matcher mUS = p.matcher(caesarUS);
		
		System.out.println(mUK.find());
		System.out.println(mUS.find());
		
	}
}
