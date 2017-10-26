package day6.exam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ExamFile {
	public static void main(String[] args) {
		File fRead = new File("C:\\1. Java_Rong, Chengqi\\test.txt");
		File fWrite = new File("C:\\1. Java_Rong, Chengqi\\output1.txt");

		Reader inReader = null;
		BufferedReader bufferedReader = null;

		Writer outWriter = null;
		BufferedWriter bufferedWriter = null;

		try {
			inReader = new FileReader(fRead);
			bufferedReader = new BufferedReader(inReader);

			outWriter = new FileWriter(fWrite);
			bufferedWriter = new BufferedWriter(outWriter);

			String string = null;
			StringBuffer stringBuffer = new StringBuffer();
			while ((string = bufferedReader.readLine()) != null) {
				stringBuffer.append(string);
				stringBuffer.append("\n");
			}
			System.out.println(stringBuffer.toString());
			stringBuffer.append("the last one");
			String str = stringBuffer.toString();
			bufferedWriter.write(str);
			System.out.println(str);
			
			inReader = new FileReader(fWrite);
			bufferedReader = new BufferedReader(inReader);
			String string2 = null;
			while ((string2 = bufferedReader.readLine()) != null){
				System.out.println(string2);
			}

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (bufferedReader != null) {
					bufferedReader.close();
				}
				if (inReader != null) {
					inReader.close();
				}
				if (bufferedWriter != null) {
					bufferedWriter.close();
				}
				
				if (outWriter != null) {
					outWriter.close();
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}
}
