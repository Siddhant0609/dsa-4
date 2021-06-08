import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class BuitlInExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x = 10;
			int y = 0;
			int z = x/y;
			System.out.println("Result = " +z);
		}
		catch(ArithmeticException e) {
			System.out.println("Cannot dividei by zero...");
		}
		
		try {
			String n = "Hello world";
			char c = n.charAt(20);
			System.out.println("Character is : "+c);
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println("String Index Out of Bound");
		}
		
		try {
			File file = new File("C://file.txt");
			FileReader fr = new FileReader(file);
		}
		catch(FileNotFoundException e) {
			System.out.println("File not found");
		}
	}

}
