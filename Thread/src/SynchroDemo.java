public class SynchroDemo implements Runnable {
	private Thread t;
	private int[] nums;
	static SumArray sa = new SumArray();
	
//  建構子，利用Thread的功能run()，所以成員變數t去new一個空間，資料由RunableDemo提供(拋一個string Name)
	public SynchroDemo(String name, int[] nums) {
	//  SynchroDemo中，name的建構子由Thread來提供
		t = new Thread(this, name);
		this.nums = nums;
		t.start();
	}

	public void run() {
		int ans = sa.sumArr(nums);
		System.out.println(t.getName()+":sum = "+ans);
	}

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		new SynchroDemo("Thread1",nums);
		new SynchroDemo("Thread2",nums);
	}
}
