class Dog {
 void bark() //�����k bark()
 { System.out.print("�L�L");
 }}

class WolfDog extends Dog {
 void bark() //�л\�����O��k
 { System.out.println("�L��L����");
 }}

class Doberman extends Dog {
 void bark() //�л\�����O��k
 {	 super.bark(); //�I�s�����O�w�q����k
	 System.out.println("��L�L�L��");
	 }
	} 

public class testOOP {
	public static void main(String [] args)
	 {
	 //�إߪ���éI�s���k
	 new WolfDog().bark();
	 new Doberman().bark();
	 new Dog().bark();
	 }
}