import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		String password = "12345678";
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J�K�X");

		for(i=0; i<3; i++)
		{	
			String inputPasswd = scanner.next();
			if(inputPasswd.equals(password))
				{   System.out.println("�K�X���T");
					scanner.close();
					break;
				}
			else
					System.out.println("��J���~�A�Э��s��J�K�X");
			}
	}
}
