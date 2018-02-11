
public class ThreadDemo1 extends Thread{
	
	public void run() {
		for(int i=0; i< 100; i++)
			System.out.println(getName()+"JNumber"+i);
	}
	
	public static void main(String[] args) {
		Thread t1 = new ThreadDemo1();
		t1.setName("Thread 1");
		t1.start();
	//  變數型別用Thread or ThreadDemo1都可，課本是用ThreadDemo1
		ThreadDemo1 t2 = new ThreadDemo1();
		t2.setName("Thread 2");
		t2.start();
		
	}

}
