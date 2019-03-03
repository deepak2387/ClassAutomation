package oops.abstraction;

public class User {

	public static void main(String[] args) {
		
		RBI ref;
		ref=new HDFC();
		ref.savingsAcc();
		ref.currentAcc();
		ref.debitCard();
		ref.creditCard();
		
		ref=new SBI();
		ref.savingsAcc();
		ref.currentAcc();
		ref.debitCard();
		ref.creditCard();
		
		ref=new CITY();
		ref.savingsAcc();
		ref.currentAcc();
		ref.debitCard();
		ref.creditCard();
			
	}

}
