package exam1016;

public class MonkeyEat {
	public static void main(String[] args) {
		int day = 9;
		int sum = 0;
		int peach =1;
		
		for (int i = day; i > 0; i--) {
			sum = 2*(peach+1);
			peach = sum;
		}
		
		System.out.println(sum);
	}
}
