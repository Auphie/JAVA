
public class Book {

	String[] greetings = {"Hello","Hi","Good"};
	
	public void printGreetings(int n) {
		System.out.println(greetings[n]);
	}
	
	public static void main(String[] args) {
		Book b = new Book();
		try {
			for(int i=0;i<4;i++)
				b.printGreetings(i);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array out of range");
		}catch(Exception e) {
			System.out.println("Exception");
		}finally {
			System.out.println("Fianlly print");
		}
		System.out.println("Program end");
	}
}
