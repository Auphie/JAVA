public class JoinDemo implements Runnable {
	Thread t;
		
	public JoinDemo(String name) {
	//  建構子，利用Thread的功能run()，所以成員變數t去new一個空間，資料由RunableDemo提供(拋一個string Name)
		t = new Thread(this, name);
		t.start();
		System.out.println(t);
	}

	public void run() {
		for(int i=0; i< 100; i++)
			System.out.println(t.getName()+" Num "+i);
	}

	public static void main(String[] args) {
		JoinDemo nt1 = new JoinDemo("Thread1");
		JoinDemo nt2 = new JoinDemo("Thread2");
		System.out.println(nt1.t.getName()+":"+nt1.t.isAlive());
		System.out.println(nt2.t.getName()+":"+nt2.t.isAlive());
		try {
			nt1.t.join();
			nt2.t.join();
		} catch(InterruptedException e) {
		  }
		System.out.println(nt1.t.getName()+":"+nt1.t.isAlive());
		System.out.println(nt2.t.getName()+":"+nt2.t.isAlive());
	}
}
