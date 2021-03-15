package question8;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * "How do I create a file and write to it in Java?"
 * 
 * @author Armin Kerscher
 */
public class Question8 {

	public static void main(String[] args) {
		
		// Simply create empty file, with size of 0 bytes
		try {
			new File("emptyFile").createNewFile();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		
		// Result: A file with size of 5 bytes
		try(FileOutputStream out = new FileOutputStream(new File("FileOutputStreamTest"))) {
			
			byte[] byteArray = {1, 2, 3, 4, 5};
			
			out.write(byteArray);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		// Result: A file with size of 16 bytes and with content:
		//hello
		//w
		//o
		//r
		//l
		//d
		try(PrintWriter writer = new PrintWriter(new File("PrintWriterTest"))) {
			
			writer.print("hello");
			writer.println();
			
			"world".chars().forEach(eachChar -> writer.println(Character.toString(eachChar)));
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
