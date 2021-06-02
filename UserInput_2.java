import java.io.IOException;
import java.util.Scanner;

public class UserInput_2 {
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Emp Id : ");
        int id = scanner.nextInt();
        System.out.println("Id is : " + id);
        
        System.out.println("Enter your name");
        scanner.nextLine();  // it will eat the \n that is coming from above one
        String name = scanner.nextLine();
        System.out.println("Hello : " + name );

        System.out.println("Enter your age : ");
        int age = scanner.nextInt();
        System.out.println("Age is : " + age);

        System.out.println("Enter your salary : ");
        double salary = scanner.nextDouble();
        System.out.println("Age is : " + salary);
        
        
        scanner.close();
    }
}
