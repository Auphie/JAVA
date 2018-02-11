
public class S01_Power {

	static int power(int x, int n) {
		int result = x;
		for(int i=1; i<n; i++)
			{
			 result *= x;
			}
		return result;
	}
	
	public static void main(String[] args) {
		int num = 4, times = 3, ans;
		ans = power(num, times);
		System.out.println(num + " multiple " + times + " times =" +ans);
	}

}
