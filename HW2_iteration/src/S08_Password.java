import java.util.Scanner;
public class S08_Password {

	public static void main(String[] args) {
		int count = 1;
		String password = "12345678";
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入密碼");
		String inputPasswd = scanner.next();
		if(inputPasswd.equals(password))
			System.out.println("密碼正確");
		else 
		{
		loop1:
		do {
			System.out.println("Count= " + count);
			System.out.println("輸入錯誤，請重新輸入密碼");
			inputPasswd = scanner.next();
			if(inputPasswd.equals(password))
				{
				System.out.println("密碼正確");
				scanner.close();
				break loop1;
				}
			else count++;
			if(count == 3)
				{	System.out.println("輸入錯誤3次，暫停使用");
					break loop1;
				}
		} while (inputPasswd != password);
		scanner.close();
		}
	}

}
