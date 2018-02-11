
public class S03_IsPrime {

	static boolean isPrime(int x) {
		int count = 0; 
		boolean result;
		 for(int i=1; i<x; i++){
			if(x%i == 0)
			 count += 1;
			}
		 if(count == 1)
			 result = true;
		 else result = false;
		return result;
		}
	
	public static void main(String[] args) {
		int number = 105;
		if(isPrime(number) == true)
			System.out.println("Number '"+number + "' is a prime number.");
		else System.out.println("Number "+number + "is Not a prime number.");
	}

}
