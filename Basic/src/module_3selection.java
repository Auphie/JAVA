
public class module_3selection {
	public static void main(String[] args) {
		/*
		int cov = 300, area = 500;
		int count;
		count = area/cov;
		count += (count % cov ==0)? 1:0;
		System.out.println("Need " + count + "cans");

	int sum = 0;
	for (int n=1; n<=10; n++)
		sum += n;
	System.out.println(sum);
*/
   // 99乘法表，利用printf來練習 
		for (int i=0; i<9; i++)
		{
		 for (int j=0; j<9; j++)
			{
			 System.out.printf("%d*%d=%d\t",(i+1),(j+1),(i+1)*(j+1));
			}
		 System.out.print("\n");
		}
	}
}
