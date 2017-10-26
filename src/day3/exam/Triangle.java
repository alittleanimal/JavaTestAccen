package day3.exam;

public class Triangle implements IShape, IPrintable {

	private double a, b, c;

	public Triangle() {
	}

	public Triangle(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	@Override
	public void print() {		
		System.out.println("the perimeter of triangle is: " + getPerimeter());
		System.out.println("the area of triangle is: " + getArea());
	}

	@Override
	public double getPerimeter() {
		double peri = a + b + c;
		return peri;
	}

	@Override
	public double getArea() {
		double p = 0.5 * (a + b + c);
		double area_temp = p * (p - a) * (p - b) * (p - c);
		double area = Math.sqrt(area_temp);

		

		return area;

	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}
	
	

}
