package test1016;

import java.util.Scanner;

public class Factorial {
	
	public static int cal(int number) {
		if(number == 1||number == 0){
			return 1;
		}else {
			return number*cal(number-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int b = in.nextInt();
		int a = cal(b);
		System.out.println("the factorial of "+b + " is "+a);
	}
}
