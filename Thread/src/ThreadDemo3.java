
public class ThreadDemo3 extends Thread{

	//  �Q�Ϋغc�l���覡�N�W�r�ǹL�h�A�åB�N�C�����n���檺start()��i�غc�l������C
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
