package day2.interfa;

public abstract class Shape {
	public abstract double area(); // 两个抽象方法

	public abstract double circumference(); // 注意，没有主体，只有分号
}

class Circle extends Shape {
	public static final double PI = 3.14159265358979323846;
	protected double r; // 实例字段

	public Circle(double r) {
		this.r = r;
		System.out.println(r);
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
}

class Rectangle extends Shape {
	protected double w, h; // 实例字段

	public Rectangle(double w, double h) { // 构造方法
		this.w = w;
		this.h = h;
		System.out.println(w+"  "+h);
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
