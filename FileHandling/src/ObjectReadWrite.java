import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Emp implements Serializable {
	private String name;
	private int id;
	Emp(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("Cons call...");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}


public class ObjectReadWrite {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		Emp obj = new Emp(101, "Ram");
		FileOutputStream fo = new FileOutputStream("emp_data.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(obj);
		os.close();
		fo.close();
		System.out.println("Object written...");
		
		System.out.println("=====================");
		
		System.out.println("Reading Object...");
		FileInputStream fs = new FileInputStream("emp_data.dat");
		ObjectInputStream oi = new ObjectInputStream(fs);
		Emp e = (Emp)oi.readObject();
		System.out.println(e.getId() + " : " + e.getName());
		oi.close();
		fs.close();
		
	}

}
