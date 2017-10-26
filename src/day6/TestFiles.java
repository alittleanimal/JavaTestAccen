package day6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;

public class TestFiles {
	public static void main(String[] args) {
		File fRead = new File("C:/1. Java_Rong, Chengqi/hello.java");
		File fWrite = new File("C:/1. Java_Rong, Chengqi/test.txt");
		
		Reader fileReader = null;
		BufferedReader bufferedReader = null;
		
		Writer fileWriter = null;
		BufferedWriter bufferedWriter = null;
		try {
			fileReader = new FileReader(fRead);
			bufferedReader = new BufferedReader(fileReader);
			
			fileWriter = new FileWriter(fWrite);
			bufferedWriter = new BufferedWriter(fileWriter);
			
			String string = null;
			StringBuilder stringBuilder = new StringBuilder();
			while((string = bufferedReader.readLine())!=null){
				//stringBuilder.append(b)
			}
		} catch (IOException e) {
			// TODO: handle exception
		}
	}
}
