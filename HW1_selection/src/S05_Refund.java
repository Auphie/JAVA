import java.util.Scanner;

public class S05_Refund {
	public static void main(String[] args) {
		System.out.println("���I���B ");
		Scanner scanner = new Scanner(System.in);
		int payable = scanner.nextInt();
		System.out.println("��I���B ");
		int paid = scanner.nextInt();
		scanner.close();

		int exchange = paid - payable;
		int aThousands = exchange/1000;
		int fiveHundred = (exchange%1000)/500;
		int aHundred = (exchange%500)/100;
		int fifty = (exchange%100)/50;
		int ten = (exchange%50)/10;
		int five = (exchange%10)/5;
		int one = exchange%5;
		
		if(paid < payable)
			System.out.println("���B����");
		else if (paid == payable)
			System.out.println("�������");
		else {
			System.out.print("����s ");
			if(aThousands > 0)
				System.out.print("1000���r��" + aThousands +"�i ");
			if(fiveHundred > 0)
				System.out.print("500���r��" + fiveHundred +"�i ");
			if(aHundred > 0)
				System.out.print("100���r��" + aHundred +"�i ");
			if(fifty > 0)
				System.out.print("50���w��" + fifty +"�� ");
			if(ten > 0)
				System.out.print("10���w��" + ten +"�� ");
			if(five > 0)
				System.out.print("5���w��" + five +"�� ");
			if(one > 0)
				System.out.print("1���w��" + one +"�� ");
			}
	}
}