class NormalUser {
	int delivery_charges = 100;
	int delivery_time = 5;
	boolean gift_feature = false;
}

class PrimeUser extends NormalUser {
	int prime_delivery_charges = 10;
	int prime_delivery_time = 1;
	boolean prime_gift_feature = true;
}

class AmazonNormalUsers {
	NormalUser show() {
		System.out.println("This is normal user account...");
		NormalUser obj = new NormalUser();
		return obj;
	}
	
}

class AmazonPrimeUsers extends AmazonNormalUsers {
	@Override
	PrimeUser show() {
		System.out.println("This is prime user account...");
		PrimeUser obj = new PrimeUser();
		return obj;
	}
	
}


public class CovariantReturnType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AmazonPrimeUsers obj = new AmazonPrimeUsers();
		PrimeUser primeObj = obj.show();
		
	}

}
