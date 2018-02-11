import java.util.Scanner;

public class S01_Electricity {

	public static void main(String[] args) {
		System.out.println("Input your electricity degree:");
		Scanner scanner = new Scanner(System.in);
		double degree = scanner.nextInt();
		scanner.close();
		int type = 1;
		double utilityBill = 0;

		switch (type) {
			case 0: utilityBill = degree * 0.45;
				break;
			case 1: if(degree < 240)
						utilityBill = degree * 0.15;
					else if(degree > 540)
						utilityBill = degree * 0.45;
					else utilityBill = degree * 0.25;
				break;
		}
		System.out.printf("The utility bill is %,.0f NT dollors.%n", utilityBill);
	}

}
