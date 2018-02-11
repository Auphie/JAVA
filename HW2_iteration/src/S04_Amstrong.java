
public class S04_Amstrong {

	public static void main(String[] args) {
		int x = 1000;
		for(int i=100; i<x; i++)
			{	int hund = i/100;
				int ten = (i%100)/10;
				int one = (i%10);
				int sum = hund*hund*hund + ten*ten*ten + one*one*one;
			if(i == sum)
			System.out.println(i + ", ");
			}
	}
}
