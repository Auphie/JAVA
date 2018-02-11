
public class AccountMain {
	public static void main(String[] args) {
		Account_p106 a = new Account_p106("124654",50000.0);
		Account_p106 b = new Account_p106("100001",150000.0);
		Account_p106 c = new Account_p106("100011",150.0);
		a.printAccData();
		b.printAccData();
		c.printAccData();
		
		CheckingAccount ch = new CheckingAccount("837444", 18730.0, 20);
		ch.printAccData();
		System.out.print("---------------------------\n");
	// 以下開始多型練習
		Account_p106[] d = new Account_p106[2];		// 先建構father reference與空間
		d[0] = new Account_p106("124654",50000.0);
		d[1] = new CheckingAccount("837444", 18730.0, 20);	//將F 
		for(int i=0; i < d.length; i++)
			d[i].printAccData();
	}
}
