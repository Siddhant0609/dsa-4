import java.io.File;
import java.io.IOException;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
//			String path = "demo.txt";
			String path = "X:/demo.txt";
			File file = new File(path);
			if(file.exists()) {
				System.out.println("File Already Exist...");
			}
			else {
				file.createNewFile();  // throw new IOException
				System.out.println("New File Created...");
			}
		}
		catch(NullPointerException e) {
			System.out.println("Null Exception...");
		}
		catch(IOException e) {
			System.out.println("File cannot be created...");
		}
//		catch(Exception e) {
//			System.out.println("Some Error...");
//		}

	}

}
