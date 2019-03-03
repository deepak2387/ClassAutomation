package oops.encapsulation;

public class Bank {
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		if(balance>1000){
			this.balance = balance+150;
		}else if(balance<1000){
		this.balance = balance-50;
		}
			}
	public String getCustomeName() {
		return customeName;
	}
	public void setCustomeName(String customeName) {
		this.customeName = customeName;
	}
	private int balance;
	private String customeName;
	

}
