package day3.exam;

public class TestSharp {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(3, 4);
		rectangle.print();

		Triangle triangle = new Triangle(3, 4, 5);
		triangle.print();

		Circle circle = new Circle(3);
		System.out.println("circle perimeter: " + circle.getPerimeter());
		System.out.println("circle area: " + circle.getArea());
	}
}
