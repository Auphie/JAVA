
public class Account_p106 {
	String account;
	double balance;
	
	Account_p106(String account, double balance) {
		this.account = account;
		this.balance = balance;
	}
	
	void printAccData() {
		System.out.println("The balance of " + account + " is " + balance);
	}
	
}
