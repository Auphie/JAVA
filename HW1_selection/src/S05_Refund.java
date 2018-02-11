import java.util.Scanner;

public class S05_Refund {
	public static void main(String[] args) {
		System.out.println("應付金額 ");
		Scanner scanner = new Scanner(System.in);
		int payable = scanner.nextInt();
		System.out.println("實付金額 ");
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
			System.out.println("金額不足");
		else if (paid == payable)
			System.out.println("不必找錢");
		else {
			System.out.print("應找零 ");
			if(aThousands > 0)
				System.out.print("1000元鈔票" + aThousands +"張 ");
			if(fiveHundred > 0)
				System.out.print("500元鈔票" + fiveHundred +"張 ");
			if(aHundred > 0)
				System.out.print("100元鈔票" + aHundred +"張 ");
			if(fifty > 0)
				System.out.print("50元硬幣" + fifty +"個 ");
			if(ten > 0)
				System.out.print("10元硬幣" + ten +"個 ");
			if(five > 0)
				System.out.print("5元硬幣" + five +"個 ");
			if(one > 0)
				System.out.print("1元硬幣" + one +"個 ");
			}
	}
}