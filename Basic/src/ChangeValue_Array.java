// main裡面的變數被method給更動掉了

public class ChangeValue_Array {

	static void method(int[] data1) {
		for(int i=0; i<data1.length-3; i++)
			data1[i] *= 10;
	}
	
	public static void main(String[] args) {
		int[] data = {2,6,1,4,3,5};
		int[] data1 = data;					// data1與data共用記憶體位置，故會被更動
		method(data1);
		for(int i=0; i< data.length; i++)
			System.out.println(data[i]);
	}

}
