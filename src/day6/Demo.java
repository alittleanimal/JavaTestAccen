package day6;

public class Demo {
	String string = new String("Good");
	char[] ch= {'a','b','c'};
	public static void main(String[] args) {
		int sum =0;
		for (int i = 1; i < 5; i++) {
			sum+=i;
			if (i%3==0) {
				break;
			}
		}
		System.out.println(sum++);
		
	}
	
	public void exchange(String str, char ch[]){
		str = "test ok";
		ch[0] = 'g';
	}
}
