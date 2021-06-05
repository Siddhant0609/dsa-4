import java.util.Date;
import java.util.Scanner;

class User {
	private String UserId;
	private String pwd;
	private String username;
	private int age;
	private String city;
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}

class Message {
	private String msg;
	private Date date;
	private String UserId;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	
}

class View {
//	void login() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.print("Enter User Id : ");
//		String userId = scanner.next();
//		System.out.print("Enter the Passowrd : ");
//		String pwd = scanner.next();
//		DB db = new DB();
//		db.checkLogin(userId,pwd);
//	}
	
	void register() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter User Id : ");
		String userId = scanner.next();
		System.out.print("Enter the Password : ");
		String pwd = scanner.next();
		System.out.print("Enter the Name : ");
		String name = scanner.next();
		System.out.print("Enter the Age : ");
		int age = scanner.nextInt();
		System.out.print("Enter the City : ");
		String city = scanner.next();
		
		User user = new User();
		user.setAge(age);
		user.setUserId(userId);
		user.setCity(city);
		user.setUsername(name);
		user.setPwd(pwd);
		
		DB db = new DB();
		Message msg = db.checkLogin(user);
		System.out.println(msg.getMsg());
		System.out.println(msg.getUserId());
		System.out.println(msg.getDate());
		
	}
}

class DB {
//	void checkLogin(String userId, String pwd) {
//		String message = "";
//		Date date = null;
//		if(userId.equals(pwd)) {
//			message = "Login Success : ";
//			date = new Date();
//		}
//		else {
//			message = "Login Failed...";
//		}
//	}
	
	Message checkLogin(User user) {
		String message = "";
//		Date date = null;
		Message msg = new Message();
		if(user.getUserId().equals(user.getPwd())) {
			message = "Login Success : ";
		}
		else {
			message = "Login Failed...";
		}
		msg.setMsg(message);
		msg.setDate(new Date());
		msg.setUserId(user.getUserId());
		return msg;
	}
	
}

public class PassObjectReturnObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		View view = new View();
		view.register();
	}

}
