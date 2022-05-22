package javaobject;

public class InterfaceEx1 {

	public static void main(String[] args) {
		InterCat cat = new InterCat();
		
		cat.eat();
		
		InterTiger tiger = new InterTiger();

		tiger.eat();
		tiger.move();
	}

}
