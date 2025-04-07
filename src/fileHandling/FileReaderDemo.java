package fileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderDemo {

	//path of the file 
	// name of the file
	
	//goto a library and get the book ABC
	
	/*
	 * Disadvantages -> reader.read()
	 * Reads a single character
	 * returing integer value
	 * Always Close the REader
	 */
	public static void main(String[] args) throws IOException {
		
//		String path ="/javaBasics/src/fileHandling/TestData";
		String path ="D:\\eclipse-workspace\\Selenium Edureka\\javaBasics\\src\\fileHandling\\TestData";
		FileReader reader = new FileReader(path);
		
//		System.out.println((char)reader.read());
	
	
	//Print all the characters
	int c = 0;
		while ((c = reader.read()) != -1) {
            System.out.print((char) c);
        }
		reader.close();
		
		
		String path1 ="D:\\eclipse-workspace\\Selenium Edureka\\javaBasics\\src\\fileHandling\\TestData2";
		
		FileWriter writer= new FileWriter(path1);
		FileReader reader1 = new FileReader(path1);
		
		writer.write("Hello World");
		
		int c1 = 0;
		while ((c1 = reader1.read()) != -1) {
            System.out.print((char) c1);
        }
		writer.close();

}
}
