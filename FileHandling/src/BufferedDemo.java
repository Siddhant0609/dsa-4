import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String sourcePath = "F:/DIT_DSA/Group_4/Songs/song_1.mp3";
		String destPath = "F:/DIT_DSA/Group_4/Songs/song_2.mp3";
		
		File file = new File(sourcePath);
		final int EOF = -1;
		if(!file.exists()) {
			System.out.println("File not exist...");
			return;
		}
		
		FileInputStream fs = new FileInputStream(file);
		BufferedInputStream bs = new BufferedInputStream(fs);
		FileOutputStream fo = new FileOutputStream(destPath);
		BufferedOutputStream bo = new BufferedOutputStream(fo);
		
		long startTime = System.currentTimeMillis();
		System.out.println("Copying Started...");
		
		int singleByte = bs.read();
		while(singleByte != EOF) {
			bo.write(singleByte);
			singleByte = bs.read();
		}
		bs.close();
		bo.close();
		fs.close();
		fo.close();
		
		long endTime = System.currentTimeMillis();
		double totalTime = endTime - startTime;
		totalTime = totalTime / 1000;
		System.out.println("Data Copied in : "+totalTime);

	}

}
