import java.util.Scanner;

public class S08_PassWd_ver2 {
	public static void main(String[] args) {
		String password = "12345678";
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		for(i=0; i<=3; i++) {
			if(i == 3)
				{
				System.out.println("3次，暫停使用");
				break; }
			else {
				System.out.println("請輸入密碼");
				String inputPasswd = scanner.next();
				if(inputPasswd.equals(password)) {
				   System.out.println("密碼正確");
				   break;
					}
				else
					System.out.print("輸入錯誤，");
			}
		}
		scanner.close();
	}
}