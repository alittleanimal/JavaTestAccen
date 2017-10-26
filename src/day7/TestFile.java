package day7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestFile {
	private File fRead;
	private File fWrite;
	
	private Reader inReader;
	private BufferedReader bufferedReader;

	private Writer outWriter;
	private BufferedWriter bufferedWriter;
	
	@Before
	public void Start(){
		fRead = new File("C:\\1. Java_Rong, Chengqi\\test.txt");
		fWrite = new File("C:\\1. Java_Rong, Chengqi\\output.txt");
		try {
			inReader = new FileReader(fRead);
			bufferedReader = new BufferedReader(inReader);
			outWriter = new FileWriter(fWrite);
			bufferedWriter = new BufferedWriter(outWriter);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void Open() {
		String string = null;
		int i = 0;
//		StringBuffer stringBuffer = new StringBuffer();
		List<String> listTarget = new ArrayList<String>();
		listTarget.add("hello world");
		listTarget.add("test1");
		listTarget.add("exam");
		List<String> listReadList = new LinkedList<String>();
		
		try {
			while ((string = bufferedReader.readLine()) != null) {
				listReadList.add(string);
				Assert.assertEquals(listTarget.get(i), string);
				i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@After
	public void Close(){
		try {
			if (inReader != null) {
				inReader.close();
			}
			if(outWriter != null){
				outWriter.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
