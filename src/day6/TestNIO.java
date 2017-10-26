package day6;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class TestNIO {

	public static void main(String[] args) {
		Path tempJar = Paths.get("sample.jar");
		FileSystem workingFS;
		
		ByteBuffer b = ByteBuffer.allocateDirect(65536);
		ByteBuffer b2 = ByteBuffer.allocate(4096);
		
		byte [] data = {1,2,3};
		ByteBuffer b3 = ByteBuffer.wrap(data);
		try {
			workingFS = FileSystems.newFileSystem(tempJar, null);
			Path pathForFile = workingFS.getPath("/hello.txt");
			List<String> lsList = new ArrayList<String>();
			lsList.add("Hello World!");
			Files.write(pathForFile, lsList, Charset.defaultCharset(),
					StandardOpenOption.WRITE,StandardOpenOption.CREATE);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
