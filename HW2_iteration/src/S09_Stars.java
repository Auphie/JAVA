
public class S09_Stars {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.print("\n");
		}
		System.out.print("\n");	

		
		for(int i = 0; i < 5; i++)
		{	 for(int j=0; j< 5; j++)
				 if(i<=j)
					 System.out.print("*");
				 else System.out.print(" ");
			 System.out.print("\n");
		}
		System.out.print(" ");
	}
}
