
public class ThreadDemo1 extends Thread{
	
	public void run() {
		for(int i=0; i< 100; i++)
			System.out.println(getName()+"JNumber"+i);
	}
	
	public static void main(String[] args) {
		Thread t1 = new ThreadDemo1();
		t1.setName("Thread 1");
		t1.start();
	//  �ܼƫ��O��Thread or ThreadDemo1���i�A�ҥ��O��ThreadDemo1
		ThreadDemo1 t2 = new ThreadDemo1();
		t2.setName("Thread 2");
		t2.start();
		
	}

}
