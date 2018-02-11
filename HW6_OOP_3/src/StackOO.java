import java.util.*;

public class StackOO {
	int capacity;
	List<Integer> arrayBox = new ArrayList<>();
	
	public StackOO(int capacity) {
		super();
		this.capacity = capacity;
	}

	public void push(Integer num) throws StackFullException{
	    System.out.println("�s�W: " + num);
		if(arrayBox.size() < capacity) { 
			arrayBox.add(num);
		} else throw new StackFullException();
	}

	public Integer pop() throws ArrayIndexOutOfBoundsException {
		System.out.println("����" + arrayBox.get(arrayBox.size()-1) + "�w�Q����");
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
		System.out.println("Array���@���G" + box.arrayBox.size() + "��");
		} catch(StackFullException f) {
				System.out.println("���~�o�͡I�}�C�ƶq��J�W�L4�ӭ���A�L�k�APUSH");
		}
		  catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("���~�o�͡I�}�C�ƶq�w��0�ӡA�L�k�APOP");
		}
	}

}
