package day6.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ExamFile3 {
	public static void main(String[] args) {
		File fRead = new File("C:\\1. Java_Rong, Chengqi\\test.txt");
		File fWrite = new File("C:\\1. Java_Rong, Chengqi\\output.txt");


		try (Reader inReader = new FileReader(fRead);
				BufferedReader bufferedReader = new BufferedReader(inReader);

				Writer outWriter = new FileWriter(fWrite);
				BufferedWriter bufferedWriter = new BufferedWriter(outWriter);) {

			String string = null;
			StringBuffer stringBuffer = new StringBuffer();
			while ((string = bufferedReader.readLine()) != null) {
				stringBuffer.append(string);
				stringBuffer.append("\n");
			}
			System.out.println(stringBuffer.toString());
			stringBuffer.append("这是最后一行。");
			bufferedWriter.write(stringBuffer.toString());

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try (Reader inReader = new FileReader(fWrite);
				BufferedReader bufferedReader = new BufferedReader(inReader);) {
			String string = null;
			System.out.println(fWrite.getName());
			while ((string = bufferedReader.readLine()) != null) {
				System.out.println(string);
			}
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}
}
