import java.util.*;

public class HashMapPractice {

	public static void main(String[] args) {
		Map<String, String> tel = new HashMap<>();
		tel.put("John", "111111111");
		tel.put("Tom", "222222222");
		tel.put("Mary", "333333333");

		//String p1 = tel.get("Mary");
		System.out.println(tel.get("Mary"));
	//  HashMap不屬於collection類別內，所以無法使用Iterator
	/*	Iterator<String,String> iter = tel.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
	*/
		for(String all:tel.values())
			System.out.println(all);
	}

}
