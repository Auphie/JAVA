class Dog {
 void bark() //物件方法 bark()
 { System.out.print("汪汪");
 }}

class WolfDog extends Dog {
 void bark() //覆蓋父類別方法
 { System.out.println("汪～汪～嗚～");
 }}

class Doberman extends Dog {
 void bark() //覆蓋父類別方法
 {	 super.bark(); //呼叫父類別定義的方法
	 System.out.println("～汪汪汪～");
	 }
	} 

public class testOOP {
	public static void main(String [] args)
	 {
	 //建立物件並呼叫其方法
	 new WolfDog().bark();
	 new Doberman().bark();
	 new Dog().bark();
	 }
}