package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FilenotFound_Demo {

	public static void main(String args[]) {
		File file = new File("E://file.txt");
		try {
			FileReader fr = new FileReader(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}