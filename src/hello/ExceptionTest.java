package hello;

import java.io.FileReader;

public class ExceptionTest {
	public static void main(String[] args) {
		int i = 0;
		try {
			String filenameString = "1.txt";
			i++;
			FileReader fileReader = new FileReader(filenameString);
		} catch (Exception e) {
			e.printStackTrace();
			i++;
			return;
		}finally{
			i++;
			System.out.println(i);
		}
	}
}
