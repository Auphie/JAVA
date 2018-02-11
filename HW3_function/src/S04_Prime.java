
public class S04_Prime {

	static int Prime(int x) {
		int num = 0, ct = 0, i = 2;

		do
		{ 
		  int count = 0;
		
		  for(int j=1; j<i; j++){
			  if(i%j == 0)
				  count += 1;
		  }
		  
		  if(count == 1) {
			  num = i;
			  ct ++;
		  }
		  
		  i++;
		} while (ct < x);
		
		return num;
}
	
	public static void main(String[] args) {
		int number = 10;
		int ans;
		ans = Prime(number);
		System.out.print(ans);
	}

}
