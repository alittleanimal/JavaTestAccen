package day7;

public class JunitTest1 {
	public double divide(double x, double y) {

		try {
			if (y == 0)
				throw new Exception("error");

		} catch (Exception e) {
			// TODO Auto-generated catch block
		}

		return x / y;
	}
}
