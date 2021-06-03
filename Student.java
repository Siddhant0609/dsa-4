class StudentDetails {
    // member variables
    int rollno;
    String name;
    String course;
    String address;
    double fees;

    public void showDetails() {
        System.out.println("Roll no : " + this.rollno);
        System.out.println("Name : " + this.name);
        System.out.println("Course : " + this.course);
        System.out.println("Address : " + this.address);
        System.out.println("Fees : " + this.fees);
    }
}

public class Student{
    public static void main(String[] args) {
        StudentDetails ram = new StudentDetails();
        // System.out.println("Roll no : " + ram.rollno);
        // System.out.println("Name : " + ram.name);
        // System.out.println("Course : " + ram.course);
        // System.out.println("Address : " + ram.address);
        // System.out.println("Fees : " + ram.fees);
        
        ram.rollno = 101;
        ram.name = "Ram";
        ram.course = "BCA";
        ram.address = "Delhi";
        ram.fees = 10000.0;
        ram.showDetails();

        // System.out.println("====================================");

        // System.out.println("Roll no : " + ram.rollno);
        // System.out.println("Name : " + ram.name);
        // System.out.println("Course : " + ram.course);
        // System.out.println("Address : " + ram.address);
        // System.out.println("Fees : " + ram.fees);

        StudentDetails shyam = new StudentDetails();
        shyam.rollno = 102;
        shyam.name = "Shyam";
        shyam.course = "MCA";
        shyam.address = "Delhi";
        shyam.fees = 10000.0;
        shyam.showDetails();

        // System.out.println("====================================");

        // System.out.println("Roll no : " + shyam.rollno);
        // System.out.println("Name : " + shyam.name);
        // System.out.println("Course : " + shyam.course);
        // System.out.println("Address : " + shyam.address);
        // System.out.println("Fees : " + shyam.fees);

    }
}