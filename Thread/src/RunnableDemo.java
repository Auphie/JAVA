
public class RunnableDemo implements Runnable {
	Thread t;
		
	public RunnableDemo(String name) {
//  建構子，利用Thread的功能run()，所以成員變數t去new一個空間，資料由RunableDemo提供(拋一個string Name)
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
