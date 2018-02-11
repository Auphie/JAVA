
public class Factor {

	static int factorial(int n) {
		int result = 1;
		for(int i=n; i>0; i--)
		 result *= i;
		return result;
	}
	
	public static void main(String[] args) {
	   int a = 200;
	   int b = 1000;
		System.out.println((b-a)/1000);
		System.out.println("The result is" + factorial(5));
	}

}
