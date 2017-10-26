package day2.interfa;

public class Shapeimp {
	public Shapeimp() {
		// TODO Auto-generated constructor stub
	}
}

class I_Circle implements IShape {
	
	public enum test{
		test1("hello1"),test2("hello2"),test3("hello3");
		
		String nameString;
		private test(String name) {
			nameString = name;
		}
	}
	
	public static final double PI = 3.14159265358979323846;
	protected double r; // 实例字段

	public I_Circle(double r) {
		this.r = r;
	} // 构造方法

	public double getRadius() {
		return r;
	} // 访问器

	public double area() {
		return PI * r * r;
	} // 实现超类中的

	public double circumference() {
		return 2 * PI * r;
	} // 两个抽象方法
	
	static void test(){
		 System.out.println("Hello");
	}
	
	public void getEnum() {
		System.out.println(test.test1.nameString);
	}
}

class i_Rectangle implements IShape {
	protected double w, h; // 实例字段

	public i_Rectangle(double w, double h) { // 构造方法
		this.w = w;
		this.h = h;
	}

	public double getWidth() {
		return w;
	} // 访问器方法

	public double getHeight() {
		return h;
	} // 另一个访问器

	public double area() {
		return w * h;
	} // 实现超类中的

	public double circumference() {
		return 2 * (w + h);
	} // 两个抽象方法
}
