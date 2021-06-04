//POJO

public class Student {
	private int rollno;
    private String name;
    private String course;
    private String address;
    private double fees;

    // Constructor - default constructor
    // by default every class has a constructor
    // it is called when the object of class is created
    public Student() {
        course = "BCA";
        // rollno = 101;
        // name = "Ram";
        // course = "BCA";
        // address = "Delhi";
        // fees = 1200.00;
    }

    // parametrized constructor
    public Student(int rollno, String name, String address, double fees) {
        this();
        this.rollno = rollno;
        this.name = name;
        // this.course = course;
        this.address = address;
        this.fees = fees;
    }

    public void takeInput(int rollno, String name, String course, String address, double fees) {
        // class variables = local variables
        if (rollno > 0 && fees < 5000) {
            this.rollno = rollno;
            this.name = name;
            this.course = course;
            this.address = address;
            this.fees = fees;
        }
        else {
            System.out.println("Invalid Input...");
        }
    }

    

    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public int getRollno() {
		return rollno;
	}

//	public void showDetails() {
//        System.out.println("Roll no : " + this.rollno);
//        System.out.println("Name : " + this.name);
//        System.out.println("Course : " + this.course);
//        System.out.println("Address : " + this.address);
//        System.out.println("Fees : " + this.fees);
//    }
	
	public String showDetails() {
		return "Roll no : " + rollno + "\nName : " + name + "\nAddress : " + address;
	}

}













