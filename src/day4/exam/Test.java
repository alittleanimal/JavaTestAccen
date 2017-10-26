package day4.exam;

public class Test {
	public static void main(String[] args) {
		Circle circle = new Circle(2);
		double bottom = circle.getArea();

		Pillar pillar = new Pillar(bottom, 4);
		double v = pillar.getPillarV();

		System.out.println("The bottom of the piller is : " + bottom);
		System.out.println("The v of the piller is :" + v);

		Geometry geometry;
		geometry = new Circle(1);
		OtherPillar otherPillar = new OtherPillar(4, geometry);
		System.out.println(otherPillar.getPillarVV());
	}
}
