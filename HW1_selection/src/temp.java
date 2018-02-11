import java.util.Scanner;

public class temp {

	public static void main(String[] args) {
		String password = "12345678";
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入密碼");

		for(i=0; i<3; i++)
		{	
			String inputPasswd = scanner.next();
			if(inputPasswd.equals(password))
				{   System.out.println("密碼正確");
					scanner.close();
					break;
				}
			else
					System.out.println("輸入錯誤，請重新輸入密碼");
			}
	}
}
