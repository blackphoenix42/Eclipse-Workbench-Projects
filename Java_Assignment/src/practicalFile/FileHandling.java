package practicalFile;

import java.io.FileReader;
import java.io.IOException;

public class FileHandling {
	public static void main(String[] args) {
		try {
			FileReader reader = new FileReader("MyFile.txt");
			int character;
			while ((character = reader.read()) != -1) {
				System.out.print((char) character);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
//import java.io.FileWriter;
//import java.io.IOException;
//
//public class TextFileWritingExample1 {
//	public static void main(String[] args) {
//		try {
//			FileWriter writer = new FileWriter("MyFile.txt", true);
//			writer.write("Hello World");
//			writer.write("\r\n"); // write new line
//			writer.write("Good Bye!");
//			writer.close();
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//	}
//}