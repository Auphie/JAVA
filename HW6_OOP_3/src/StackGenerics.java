import java.util.*;

public class StackGenerics<T>{
	static int upper;

	List<T> fourBox = new ArrayList<T>();
	
	public void push(T num) throws StackFullException {
		fourBox.add(num);
		if(fourBox.size()>4) throw new StackFullException("Stack number too much.",fourBox.size());
	}
	
	public T pop() {
		return fourBox.remove(fourBox.size());
	}
		
	public static void main(String[] args) {
		try {
			StackGenerics<Integer> s1 = new StackGenerics<>();
			s1.push(1);
			s1.push(2);
			s1.push(3);
			s1.push(4);
			s1.push(5);
			upper = s1.fourBox.size();
			System.out.println(s1.fourBox.size());
		} catch (StackFullException e) {
			System.out.println(e.msg + " Num now is " + e.num);
		}
	}

}