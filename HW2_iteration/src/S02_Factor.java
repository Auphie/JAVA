
public class S02_Factor {

	public static void main(String[] args) {
		int num = 42;

		System.out.print(num + "的因數為：");
		for(int i=1; i<num; i++)
			{if(num%i ==0)
				System.out.print(i+", ");
			}

		}

}
