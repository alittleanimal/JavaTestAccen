package day6;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Reader;

import day2.newBlock;

public class Test0925 {
	public static void main(String[] args) {
		/*File homedir = new File(System.getProperty("user.home"));
		System.out.println(homedir);
		
		File file = new File("C:/1. Java_Rong, Chengqi/hello.java");
		
		try {
			Reader inReader;
			inReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(inReader);
			String string = null;
			while((string = bufferedReader.readLine())!=null){
				System.out.println(string);
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			
		}*/
		
		
		try {
			File file = new File("C:/1. Java_Rong, Chengqi");
			FileInputStream fileInputStream = new FileInputStream(file);
			Reader in = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(in);
			bufferedReader.readLine();
			if (file.isDirectory()) {
			
			for (File string : file.listFiles()) {
				System.out.println(string);
			}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			
		}
		
		
		
		
	}
}
