package week0.day1;

import java.io.File;
import java.io.IOException;

public class CreatingAFile {

	public static void main(String[] args) throws IOException {
		
		File file = new File("Desktop\\test.txt");
		file.mkdir();
		file.createNewFile();

	}

}
