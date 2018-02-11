public class S02_Simga {

	static int factorial(int n) {
			int result1 = 1;
			for(int i=n; i>0; i--)
				result1 *= i;
			System.out.println("factorial = "+ result1);
			return result1;
		}
	
	static double power(double x, int n) {
		double result2 = x;
		for(int i=1; i<n; i++)
			{
			 result2 *= x;
			}
		System.out.println("power = "+ result2);
		return result2;
	}
	
	public static void main(String[] args) {
		int numK = 3;
		double numX = 2, ans = 0;
		for (int i = 1; i <= numK; i++)
		ans += power(numX,i)/factorial(i);
		
		System.out.println("\n");
		System.out.print("Answer = "+ ans);
	}

}
