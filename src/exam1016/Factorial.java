package exam1016;

public class Factorial {
	public static void main(String[] args) {
		int a = 5;
		System.out.println("the factorial of "+a + " is "+calculate(5));
	}
	
	/**
	 * factorial
	 * @param number
	 * @return
	 */
	public static int calculate(int number) {
		if(number == 1||number == 0){
			return 1;
		}else if (number < 0) {
			return 0;
		} 
		else {
			return number*calculate(number-1);
		}
	}
}
