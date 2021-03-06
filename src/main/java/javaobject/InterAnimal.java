package javaobject;

// 인터페이스 명 앞에 interface 가 붙는다. class 대신에 interface 를 사용한다. 
public interface InterAnimal { // 클래스명은 원래 관습상 대문자를 사용한다. 소문자로 써도 에러는 나지 않는다. 
	/*
	인터페이스는 추상 클래스와 그 성격이 비슷하다. 
	interface 는 내부의 추상메서드 (본체가 없는 메서드, 나를 상속받는 객체가 메서드를 구현하라. )를 선언한다. 
	
	Interface 는 데이터를 저장할 필드를 만들 수 없지만, 상수 (constants) 는 가질 수 있다. 
	앱을 만들 때, interface 는 받아서 override 하거나 API 클래스를 사용할 수 있다.
	
	onClick() 메서드, statusCheck() 메서드를 인터페이스에서 추상 메서드(실행 구문이 없는 또는 본체가 없는)로써 정리를 해놓으면, 나중에 클래스에서 인터페이스 메서드를 구현할 때 각각 메서드에 따른 기능을 구현하여 사용한다. 
	
	Java 8 부터.. 아래 두 가지 메서드에 대한 필요성이 생겨 추가되었다. 다만, 특정 목적 외에는 보통 추상 메서드를 사용한다.  
	디폴트 메서드 : 
	정적 메서드 : 	
	
	정리:
	interface 는 아래 네 가지 속성으로 만들어 질 수 있다. 
	1. 상수필드 
	2. 추상 메서드 
	3. 디폴트 메서드 
	4. 정적 메서드 
	 */
	// 추상 메서드 
	abstract void eat();
	
}
