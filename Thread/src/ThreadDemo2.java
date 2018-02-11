
public class ThreadDemo2 extends Thread{

	//  利用建構子的方式將名字傳過去
		public ThreadDemo2(String name) {
		super(name);
	}

	public void run() {
		for(int i=0; i< 100; i++)
			System.out.println(getName()+" Number"+i);
	}
	
	public static void main(String[] args) {
		Thread t1 = new ThreadDemo2("Thread1");
		t1.start();
	//  一次性使用時，可以簡化為如下：	
		new ThreadDemo2("Thread2").start();
		
	}

}
