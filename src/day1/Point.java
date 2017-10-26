package day1;

public class Point {
	// 点的坐标
	public double x, y;
	
	protected int a=0;

	public Point(double x, double y) { // 初始化字段的构造方法
		this.x = x;
		this.y = y;
	}

	public double distanceFromOrigin() { // 操作x和y字段的方法
		System.out.println(x*x+y*y);
		return Math.sqrt(x * x + y * y);
	}
	
	public static void main(String[] args) {
		Point p1 = new Point(2,3);
		Point p2 = new Point(2,3);
		
		System.out.println(p1);
		System.out.println(p2);
		if(p1.equals(p2)){
			System.out.println("hello");
		}else{
			System.out.println("else");
		}
	}
}
