import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;

class MyFilter implements FilenameFilter {

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		return name.endsWith(".mp3");
	}
	
}

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path = "F:/DIT_DSA/Group_4/demo.txt";
		File file = new File(path);
		if(file.exists()) {
//			file.delete();
			File file2 = new File("F:/DIT_DSA/Group_4/demo_2.txt");
			file.renameTo(file2);
			System.out.println("File Already Exist...");
		}
		else {
			file.createNewFile();
			System.out.println("File Created...");
		}
//		path = "F:/DIT_DSA/Group_4/demo/xx/yy/zz";
//		file = new File(path);
//		file.mkdir();
//		file.mkdirs();
		
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getName());
		
		file = new File("F:/DIT_DSA/Group_4/Songs");
//		File files[] = file.listFiles();
//		System.out.println("No of file : " + files.length);
//		int counter = 0;
//		for(File f : files) {
//			if(f.getName().endsWith(".mp3")) {
//				counter++;
//			}
//		}
//		System.out.println("MP3 Files: " + counter);
		 
//		MyFilter filter = new MyFilter();
//		File files[] = file.listFiles(filter);
		
		File mp3Files[] = file.listFiles((dir, name) -> name.endsWith(".mp3"));
		File pngFiles[] = file.listFiles((dir, name) -> name.endsWith(".png"));
		System.out.println("MP3 Files: " + mp3Files.length);
		System.out.println("Png Files: " + pngFiles.length);
		
	}

}






