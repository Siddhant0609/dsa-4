import java.io.IOException;
import java.util.Scanner;

public class UserInput_1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter your name");
        // int name = System.in.read(); // read one byte at a time and store ascii
        // System.out.println(name);

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();  // it will take input untill we press enter
        System.out.println("Hello : " + name );
        scanner.close();
    }
}
