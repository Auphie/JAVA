public class SynchroDemo implements Runnable {
	private Thread t;
	private int[] nums;
	static SumArray sa = new SumArray();
	
//  �غc�l�A�Q��Thread���\��run()�A�ҥH�����ܼ�t�hnew�@�ӪŶ��A��ƥ�RunableDemo����(�ߤ@��string Name)
	public SynchroDemo(String name, int[] nums) {
	//  SynchroDemo���Aname���غc�l��Thread�Ӵ���
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
