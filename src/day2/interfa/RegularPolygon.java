package day2.interfa;

public enum RegularPolygon {
	TRIANCLE(3),SQUARE(4),PENTAGON(5),HEXAGON(6);
	
	private Shape shape;
	
	public Shape getShape() {
		return shape;
	}
	
	private RegularPolygon(int sides) {
		// TODO Auto-generated constructor stub
		switch (sides) {
		case 3:
			shape = new Circle(4);		
			break;
		case 4:
			shape = new Rectangle(1, 2);
		default:
			break;
		}
	}
	
	private RegularPolygon(int x, int y){
		
	}
}
