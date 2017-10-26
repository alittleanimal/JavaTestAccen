package day6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class TestStreamFinally {
	public static void main(String[] args) {
		File fRead = new File("C:/1. Java_Rong, Chengqi/hello.java");
		File fWrite = new File("C:/1. Java_Rong, Chengqi/output.txt");

		Writer outWriter = null;
		BufferedWriter bufferedWriter = null;

		Reader inReader = null;
		BufferedReader bufferedReader = null;

		try {
			outWriter = new FileWriter(fWrite);
			bufferedWriter = new BufferedWriter(outWriter);

			inReader = new FileReader(fRead);
			bufferedReader = new BufferedReader(inReader);

			String string = null;
			StringBuilder stringBuilder = new StringBuilder();
			while ((string = bufferedReader.readLine()) != null) {
				stringBuilder.append(string);
				stringBuilder.append("\n");
				bufferedWriter.write(string);
				bufferedWriter.newLine();
			}
			System.out.println(stringBuilder.toString());
			bufferedWriter.write("new");

			inReader = new FileReader(fWrite);
			bufferedReader = new BufferedReader(inReader);
			String string2 = null;
			System.out.println(fWrite.getName());
			while ((string2 = bufferedReader.readLine()) != null) {
				System.out.println(string2);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bufferedWriter!=null) {
					bufferedWriter.close();
				}
				
				outWriter.close();
				bufferedReader.close();
				inReader.close();
			} catch (IOException e2) {
				// TODO: handle exception
			}
		}

	}

}
