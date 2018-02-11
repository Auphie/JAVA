import java.util.*;

public class Coll_temp {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(34);
		list.add(34);
		System.out.println(list);
		System.out.println(list.size());
		Iterator<Integer> o = list.iterator();
		while(o.hasNext())
			System.out.println(o.next());
		System.out.println(list);
	}

}
