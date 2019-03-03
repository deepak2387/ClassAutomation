package oops.abstraction;

public class User2 {

	public static void main(String[] args) {
		RBI ref=null;
		String name=bankName();
		if(name.equals("SBI")){
			ref=new SBI();
					}else if(name.equals("HDFC")){
						ref=new HDFC();
					}else if(name.equals("CITY")){
						ref=new CITY();
							
					}
		//bank services-script
		ref.savingsAcc();
		ref.currentAcc();
		ref.debitCard();
		ref.creditCard();
		
		
	}
	public static String bankName()
	{
		return "SBI";
		
	}

}
