import java.util.Scanner;
public class S08_Password {

	public static void main(String[] args) {
		int count = 1;
		String password = "12345678";
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J�K�X");
		String inputPasswd = scanner.next();
		if(inputPasswd.equals(password))
			System.out.println("�K�X���T");
		else 
		{
		loop1:
		do {
			System.out.println("Count= " + count);
			System.out.println("��J���~�A�Э��s��J�K�X");
			inputPasswd = scanner.next();
			if(inputPasswd.equals(password))
				{
				System.out.println("�K�X���T");
				scanner.close();
				break loop1;
				}
			else count++;
			if(count == 3)
				{	System.out.println("��J���~3���A�Ȱ��ϥ�");
					break loop1;
				}
		} while (inputPasswd != password);
		scanner.close();
		}
	}

}
