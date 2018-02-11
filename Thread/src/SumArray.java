
public class SumArray {
	int sum;
	public synchronized int sumArr(int[] nums) {
		sum = 0;
		for(int i=0;i<nums.length;i++) {
			sum += nums[i];
			System.out.println(Thread.currentThread().getName() + ":total = " + sum);
			try {
				Thread.sleep(1000);
			} catch(InterruptedException e) {
			  }
		}
		return sum;
	}
}
