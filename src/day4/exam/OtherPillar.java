package day4.exam;

public class OtherPillar {
	private double height;
	private Geometry bottomGeometry;

	public OtherPillar() {
	}

	public OtherPillar(double height, Geometry bottomGeometry) {
		this.height = height;
		this.bottomGeometry = bottomGeometry;
	}

	public double getPillarVV() {
		double v = bottomGeometry.getArea() * height;
		return v;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Geometry getBottomGeometry() {
		return bottomGeometry;
	}

	public void setBottomGeometry(Geometry bottomGeometry) {
		this.bottomGeometry = bottomGeometry;
	}
	
	

}
