package day4;

public class test0921 {
	
	int a;
	String string;
	/*public void test(int a) {
		a++;
		int b =a;
		System.out.println(a);
		System.out.println(b);
	}

	public static void main(String[] args) {
		test0921 test = new test0921();
		int a = 99;
		test.test(a);
		System.out.println(a);
	}*/
	
	public static void main(String[] args) {
		int a=10;
		Obj obj = new Obj();
		test0921 test = new test0921();
		System.out.println(test.change(obj).b);
		System.out.println(obj.b);
	}
	
	

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + ((string == null) ? 0 : string.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		test0921 other = (test0921) obj;
		if (a != other.a)
			return false;
		if (string == null) {
			if (other.string != null)
				return false;
		} else if (!string.equals(other.string))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "test0921 [a=" + a + ", string=" + string + "]";
	}



	public  Obj change(Obj obj){
		obj.b = 100;
		return obj;
	}
	
}

class Obj{
	int b=0;
}
