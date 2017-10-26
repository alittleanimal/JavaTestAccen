package day2.interfa;


public class TestShape  {

	public static void main(String[] args) {
		/*Shape[] shapes = new Shape[3]; // 创建一个保存形状的数组
		shapes[0] = new Circle(2.0); // 填充这个数组
		shapes[1] = new Rectangle(1.0, 3.0);
		shapes[2] = new Rectangle(4.0, 2.0);
		double totalArea = 0;
		for (int i = 0; i < shapes.length; i++){
			totalArea = shapes[i].area(); // 计算这些形状的面积
			System.out.println(totalArea);
		}*/
		
		I_Circle circle = new I_Circle(3);
		System.out.println(circle.circumference());
		circle.getEnum();
//		
//		Rectangle rectangle = new Rectangle(1.0, 3.0);
//		System.out.println(rectangle.circumference());
		
		/*Shape regularPolygon = RegularPolygon.TRIANCLE.getShape();
		System.out.println(regularPolygon.circumference());
		System.out.println(RegularPolygon.PENTAGON);
		for (int i = 0; i < RegularPolygon.values().length; i++) {
			System.out.println(RegularPolygon.values()[i]);
		}*/
		
		
		
	}

}
