package day3;

import java.util.List;
import java.util.ArrayList;


public class test0920 {
	
	@Nickname(value = {"feji","fje"})
	public static void main(String[] args) {
		List<String> goodsNameList = new ArrayList<String>();
		goodsNameList.add("good1");
		goodsNameList.add("good2");
		for(String goodsNaString : goodsNameList){
			System.out.println(goodsNaString);
		}
	}
}
