
public class S03_PerfectNumber {

	public static void main(String[] args) {
		int number = 100;
		for (int num =1; num <= number; num++)
		{int numSum = 0;
			for(int i=1; i<num; i++)
				{ 
				   if(num%i ==0)
					numSum += i;
				}
			if(num == numSum)
			System.out.println("number = " + num);
		}
	}
}
