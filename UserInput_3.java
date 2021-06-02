import java.io.IOException;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class UserInput_3 {
    public static void main(String[] args) throws IOException {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Emp Id : ");
        int id = scanner.nextInt();
        System.out.println("Id is : " + id);
        
        System.out.println("Enter your name");
        scanner.nextLine(); 
        String name = scanner.nextLine();
        
        // char e = name.charAt(0);
        // String firstChar = String.valueOf(e);
        // firstChar = firstChar.toUpperCase();
        // name = firstChar + name.substring(1).toLowerCase();

        String names[] = name.split(" ");
        String fullName = "";

        for(String n:names) {
            name = String.valueOf(n.charAt(0)).toUpperCase() +
             n.substring(1).toLowerCase() + " ";
            fullName += name;
        }

        System.out.println("Hello : " + fullName );

        System.out.println("Enter your salary : ");
        double salary = scanner.nextDouble();
        // Localization
        // Locale locale = new Locale("hi", "IN");
        Locale locale = new Locale("en", "IN");
        NumberFormat nf = NumberFormat.getCurrencyInstance(locale);
        String formatSalary = nf.format(salary);
        // System.out.println("Original Salary is : " + salary);
        System.out.println("Formatted Salary is : " + formatSalary);

        // Adding Date
        Date date = new Date();
        // System.out.println("Date : " + date);
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, locale);
        String dateFormat = df.format(date);
        System.out.println("Date : " + dateFormat);
        
        scanner.close();
    }
}
