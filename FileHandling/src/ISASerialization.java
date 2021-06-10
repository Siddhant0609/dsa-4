import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//class A implements Serializable{
class A{
	int x, y;
	transient int f;
	A() {
		x = 100;
		y = 200;
		f = 999;
		System.out.println("A cons call...");
	}
	void plus() {
		x++;
		y++;
		f++;
	}
}

class B extends A implements Serializable {
	int z;
	B() {
		z = 1000;
		System.out.println("B Cons call...");
	}
	void add() {
		z++;
	}
}

public class ISASerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		B obj = new B();
		obj.plus();
		obj.add();
		FileOutputStream fo = new FileOutputStream("is_data.dat");
		ObjectOutputStream os = new ObjectOutputStream(fo);
		os.writeObject(obj);
		os.close();
		fo.close();
		System.out.println("Object written...");
		
		System.out.println("=====================");
		
		System.out.println("Reading Object...");
		FileInputStream fs = new FileInputStream("is_data.dat");
		ObjectInputStream oi = new ObjectInputStream(fs);
		B e = (B)oi.readObject();
		System.out.println(e.x + " : " + e.y + " : " + e.z + " : " + e.f);
		oi.close();
		fs.close();
		
	}

}





