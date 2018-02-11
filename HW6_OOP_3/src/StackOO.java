import java.util.*;

public class StackOO {
	int capacity;
	List<Integer> arrayBox = new ArrayList<>();
	
	public StackOO(int capacity) {
		super();
		this.capacity = capacity;
	}

	public void push(Integer num) throws StackFullException{
	    System.out.println("新增: " + num);
		if(arrayBox.size() < capacity) { 
			arrayBox.add(num);
		} else throw new StackFullException();
	}

	public Integer pop() throws ArrayIndexOutOfBoundsException {
		System.out.println("元素" + arrayBox.get(arrayBox.size()-1) + "已被移除");
		return arrayBox.remove(arrayBox.size()-1);
	}

	public static void main(String[] args) {
		StackOO box = new StackOO(4);
		try {
		box.push(12);
		box.push(8);
		box.push(7);
		box.push(5);
		box.pop();
//		box.push(3);
//		box.push(1);
		box.pop();
		box.pop();
		box.pop();
		box.pop();
		System.out.println("Array內共有：" + box.arrayBox.size() + "個");
		} catch(StackFullException f) {
				System.out.println("錯誤發生！陣列數量輸入超過4個限制，無法再PUSH");
		}
		  catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("錯誤發生！陣列數量已為0個，無法再POP");
		}
	}

}
