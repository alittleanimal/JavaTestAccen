package day4;

import java.lang.annotation.Target;

public class Circle implements Comparable<Circle> {

	private final int x,y,r;
	
	
	public Circle(int x, int y, int r) {
		this.x = x;
		this.y = y;
		this.r = r;
	}
	
	public Circle(Circle original) {
		x = original.x;
		y = original.y;
		r = original.r;
	}
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getR() {
		return r;
	}
	
	@Override
	public String toString() {
		return "Circle [x=" + x + ", y=" + y + ", r=" + r + "]";
	}

	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + r;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj == this) return true;
		if(!(obj instanceof Circle)) return false;
		Circle that = (Circle) obj;
		if(this.x == that.x && this.y == that.y && this.r == that.r)
			return true;
		else return false;
	}

	@Override
	public int compareTo(Circle o) {
		long result = (long)o.y - this.y;
		if(result ==0) result = (long)this.x -o.x;
		if(result == 0) result = (long)this.r - o.r;
		
		return Long.signum(result);
	}

	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		if (r != other.r)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}*/
	
}
