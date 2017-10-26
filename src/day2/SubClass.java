package day2;

class BaseClass {
	public int book = 6;
	public void base() {
		System.out.println("father normal method");
	}
	public void test() {
		System.out.println("father test method");
	}
}

public class SubClass extends BaseClass{
	public String book = "Java";
	
	public void sub() {
		System.out.println("child normal method");
	}
	public void test() {
		System.out.println("child test method");
	}
	
	public static void main(String[] args) {
		BaseClass bc = new BaseClass();
		System.out.println( bc.book);
		bc.test();
		bc.base();
		
		SubClass subc = new SubClass();
		System.out.println(subc.book);
		subc.sub();
		subc.test();
		
		BaseClass pb = new SubClass();
		System.out.println(pb.book);
		pb.test();
		pb.base();
	}
	
}