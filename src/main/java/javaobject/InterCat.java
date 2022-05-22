package javaobject;

// 인터페이스는 상속받는다고 하지 않고 구현한다고 한다. 
public class InterCat implements InterAnimal {
	// 인터페이스는 자기를 구현하다록 요구한다. 
	String sound;

	@Override
	public void eat() {
		System.out.println("고양이는 생선을 좋아한다. ");
	}
	
	
	
	
}
