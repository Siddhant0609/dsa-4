import java.util.Date;

class Account {
	int accountNo;
	double balance;
	String accHolderName;
	Date opening;
	boolean status;
	void openAccount() {
		Date date = new Date();
		System.out.println("Open Account...");
	}
	void deposit() {
		System.out.println("Account Deposit...");
	}
	void withdraw() {
		System.out.println("Account Withdraw...");
	}
}

class SavingAccount extends Account {
	double minBalance;
	void calculateROI() {
		System.out.println("SA ROI is 5%");
	}
//	bad practice
//	void saWithdraw() {
//		System.out.println("Withdraw limit is 50K");
//	}
//	method signature - everything must be same as parent class withdraw function
//	@override is annotation, just to make sure that it is overriding
	@Override
	void withdraw() {
		System.out.println("Withdraw limit is 50K");
	}
}

class CurrentAccount extends Account {
//	od - over draft
	double odlimit;
	void computeOD() {
		System.out.println("OD limit is 1 Lakh");
	}
	@Override
	void deposit() {
		System.out.println("CA Deposit call...");
	}
}

public class IsAAndHasA {
	
	// polymorphic function
//	account is type where everyone can mix
	void caller(Account account) {
		account.withdraw();
		account.deposit();
		if(account instanceof SavingAccount) {
			SavingAccount sa = (SavingAccount) account; // downcasting
			sa.calculateROI();
		}
		else if(account instanceof CurrentAccount) {
			CurrentAccount ca = (CurrentAccount) account;
			ca.computeOD();
		}
		System.out.println("==================================");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		IsAAndHasA obj = new IsAAndHasA();
		// any child can be converted into parent
		obj.caller(new SavingAccount());
		obj.caller(new CurrentAccount());
		
		
//		SavingAccount sa = new SavingAccount();
		
//		we are creating object of SavingAccount,
//		but type of object is Account
//		Account account = new SavingAccount();
		
//		account.withdraw(100); // will call child class withdraw
//		account.withdraw(); // will call parent class withdraw
//		account.deposit();
//		account.calculateROI();
		
//		System.out.println("==================================");
		
//		CurrentAccount ca = new CurrentAccount();
//		ca.withdraw();
//		ca.deposit();
//		ca.computeOD();
		
//		we are creating object of CurrentAccount,
//		but type of object is Account
//		account = new CurrentAccount();
//		account.withdraw();
//		account.deposit();
//		account.computeOD();
		
	}

}
