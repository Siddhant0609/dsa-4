
public class Employee {
	private int empId;
	private String name;
	private double salary;
	
	private String email;
	private String dept;
	private String designation;
	private String company;
	
	public Employee() {
		this.company = "Brain Mentors";
	}
	
	public Employee(int id, String name, double salary) {
		this(); // constructor chaining
		this.empId = id;
		this.name = name;
		this.salary = salary;
	}
	
	
	// 1. Generate getter setter
	// 2. create functions to calculate hra, da, ta, ma
	// 3. create a function to calculate net salary
	
	public String printReport() {
		CommonUtils obj = new CommonUtils();
		obj.getProperName(name);
		obj.salaryFormat(salary);
		// return name, basic salary, net salary
		return "";
	}
}
