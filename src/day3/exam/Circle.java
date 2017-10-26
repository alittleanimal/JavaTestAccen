package day3.exam;

public class Circle implements IShape {

	private double r;

	public Circle() {
	}

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double getPerimeter() {
		double peri = Math.PI * r * 2;
		return peri;
	}

	@Override
	public double getArea() {
		double area = Math.PI * r * r;
		return area;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

	
}
