import java.util.Scanner;

public class S08_PassWd_ver2 {
	public static void main(String[] args) {
		String password = "12345678";
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		for(i=0; i<=3; i++) {
			if(i == 3)
				{
				System.out.println("3���A�Ȱ��ϥ�");
				break; }
			else {
				System.out.println("�п�J�K�X");
				String inputPasswd = scanner.next();
				if(inputPasswd.equals(password)) {
				   System.out.println("�K�X���T");
				   break;
					}
				else
					System.out.print("��J���~�A");
			}
		}
		scanner.close();
	}
}