
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
	// �H�U�}�l�h���m��
		Account_p106[] d = new Account_p106[2];		// ���غcfather reference�P�Ŷ�
		d[0] = new Account_p106("124654",50000.0);
		d[1] = new CheckingAccount("837444", 18730.0, 20);	//�NF 
		for(int i=0; i < d.length; i++)
			d[i].printAccData();
	}
}
