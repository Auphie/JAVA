
public class ThreadDemo3 extends Thread{

	//  利用建構子的方式將名字傳過去，並且將每次都要執行的start()放進建構子內執行。
		public ThreadDemo3(String name) {
		super(name);
		start();
	}

	public void run() {
		for(int i=0; i< 100; i++)
			System.out.println(getName()+" Number"+i);
	}
	
	public static void main(String[] args) {
		new ThreadDemo3("Thread1");
		new ThreadDemo3("Thread2");
		
	}

}
