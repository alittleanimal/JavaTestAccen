package day4.exam;

public class Pillar {
	private double bottom, height;

	public Pillar() {
	}

	public Pillar(double bottom, double height) {
		this.bottom = bottom;
		this.height = height;
	}

	public double getPillarV() {
		double v = bottom * height;
		return v;
	}

	public double getBottom() {
		return bottom;
	}

	public void setBottom(double bottom) {
		this.bottom = bottom;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	
}
