package exception.checked;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionDemo {
	
	public static void main(String[] args) throws FileNotFoundException {
		
			FileReader fileReader = new FileReader("C:\\temp\\dummy.txt");
		
	}

}
