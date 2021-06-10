import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ReadWriteDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "F:/DIT_DSA/Group_4/inheritance_basics.txt";
		File file = new File(path);
		final int EOF = -1;
		if(file.exists()) {
			FileInputStream fs = new FileInputStream(file);
			int singleByte = fs.read();
			while(singleByte != EOF) {
				System.out.print((char)singleByte);
				singleByte = fs.read();
			}
			fs.close();
		}
		
		System.out.println("=============================");
		
		String path2 = "F:/DIT_DSA/Group_4/demo.txt";
		File file2 = new File(path2);
		System.out.println("Enter data to write : ");
		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		FileOutputStream fo = new FileOutputStream(file2);
		fo.write(text.getBytes());
		fo.close();
		System.out.println("Data written...");
		scanner.close();
	}

}
