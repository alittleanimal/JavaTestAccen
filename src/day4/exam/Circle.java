package day4.exam;

public class Circle implements Geometry {

	private double r;

	public Circle() {
	}

	public Circle(double r) {
		this.r = r;
	}

	@Override
	public double getArea() {
		double bottom = Math.PI * r * r;
		return bottom;
	}

	public double getR() {
		return r;
	}

	public void setR(double r) {
		this.r = r;
	}

}
