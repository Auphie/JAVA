
public class ThreadDemo2 extends Thread{

	//  �Q�Ϋغc�l���覡�N�W�r�ǹL�h
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
	//  �@���ʨϥήɡA�i�H²�Ƭ��p�U�G	
		new ThreadDemo2("Thread2").start();
		
	}

}
