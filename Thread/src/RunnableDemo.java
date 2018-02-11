
public class RunnableDemo implements Runnable {
	Thread t;
		
	public RunnableDemo(String name) {
//  �غc�l�A�Q��Thread���\��run()�A�ҥH�����ܼ�t�hnew�@�ӪŶ��A��ƥ�RunableDemo����(�ߤ@��string Name)
	t = new Thread(this, name);
	t.start();
	System.out.println(t);
	}

	public void run() {
		for(int i=0; i< 10; i++)
			System.out.println(t.getName()+" Number"+i);
	}
	
	public static void main(String[] args) {
		new RunnableDemo("Thread1");
		new RunnableDemo("Thread2");
	}

}
