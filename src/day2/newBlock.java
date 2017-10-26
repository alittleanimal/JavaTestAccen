package day2;

public class newBlock {
	static {
		System.out.println("static block");
	}

	{
		System.out.println("block1");
	}

	public newBlock() {
		System.out.println("newBlock");
	}
	
	public void test() {
		System.out.println("normal block");
	}
	
	public static void main(String[] args) {
		System.out.println("first");
		new newBlock();
		System.out.println("second");
		new newBlock();
		System.out.println("third");
		new newBlock().test();
	}
	
	{
		System.out.println("block2");
	}
}
