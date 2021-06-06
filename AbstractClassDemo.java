abstract class Loan {
	void applyForLoan() {
		System.out.println("Apply for loan...");
	}
	abstract void emi();
	// we are forcing child class to implement this method
//	abstract void calc_roi(int p);
}

class AutoLoan extends Loan {
	@Override
	void emi() {
		System.out.println("Autoloan EMI...");
	}
	
//	void calc_roi(double p) {
//		System.out.println("ROI for Autoloan...");
//	}
}

class HomeLoan extends Loan {
	@Override
	void emi() {
		System.out.println("Homeloan EMI...");
	}
}

public class AbstractClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Loan loan = new Loan();
		HomeLoan home = new HomeLoan();
		AutoLoan auto = new AutoLoan();

	}

}
