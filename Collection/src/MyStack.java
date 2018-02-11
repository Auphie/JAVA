import java.util.*;

public class MyStack<T> {
		List<T> list = new ArrayList<T>();
		
		public void push(T val) {
			list.add(val);
		}
		
		public T pop() {
			return list.remove(list.size()-1);
		}
		
	public static void main(String[] args) {
		MyStack<Integer> s1 = new MyStack<>();
		s1.push(1);
		s1.push(2);
		System.out.println(s1.pop());
		MyStack<String> s2 = new MyStack<>();
		s2.push("Tom");
		s2.push("Fir");
		System.out.println(s2.pop());
	}
}

