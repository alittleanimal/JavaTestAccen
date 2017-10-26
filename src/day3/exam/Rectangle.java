package day3.exam;

public class Rectangle implements IShape, IPrintable {

	private int length, width;

	public Rectangle() {
	}

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;
	}

	@Override
	public void print() {
		System.out.println("the perimeter of rectangle is: " + getPerimeter());
		System.out.println("the area of rectangle is: " + getArea());
	}

	@Override
	public double getPerimeter() {
		double peri = 2 * (length + width);
		return peri;
	}

	@Override
	public double getArea() {
		double area = length * width;
		return area;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	
}
