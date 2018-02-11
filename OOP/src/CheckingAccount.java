
public class CheckingAccount extends Account_p106 {
	int checkAccount;
	
	CheckingAccount(String account,	double balance, int checkAccount) {
		super(account, balance);
		this.checkAccount = checkAccount;
	}
	
	void printAccData() {
		super.printAccData();
		System.out.println("The number of Check is " + checkAccount);
	}
}
