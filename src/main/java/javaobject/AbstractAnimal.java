package javaobject;

// 추상화클래스에는 abstract 가 클래스 명 앞에 붙는다. 
public abstract class AbstractAnimal {
	String name;
	
	// 초기화하는 생성자도 없다. 
	
	// 추상 메서드는 메서드 타입 앞에 abstract 가 붙는다. 추상 메서드는 실행 구문이 없기 때문에 메서드를 수행할 본체가 없다. 
	// 추상 메서드는 어떤 메서드가 있다는 것만 정의해놓고 그것을 사용하는 방법은 각각의 객체에서 따로 정의하여 사용한다. 
	abstract void move();
	

}
