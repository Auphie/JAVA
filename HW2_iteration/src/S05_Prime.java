
public class S05_Prime {

	public static void main(String[] args) {
		int x = 100;
		System.out.printf("小於%d的質數共有：%n",x);
		for(int i=2; i<x; i++)
			{int count = 0;
			 for(int j=1; j<i; j++){
				if(i%j == 0)
				 count += 1;
				}
			 if(count == 1)
			 System.out.printf("%d,",i);
			}
	}
}
