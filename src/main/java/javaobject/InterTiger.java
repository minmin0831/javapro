package javaobject;

public class InterTiger extends AbstractAnimal implements InterAnimal {
	
	/*
	상속과 구현은 해당 클래스 파일에서 끝난다. EX 파일에서 사용하는 방법은 상속 시 사용 방법과 동일하다. 
	 */
	@Override
	public void eat() {
		System.out.println("호랑이는 맷돼지 좋아합니다");		
	}

	@Override
	void move() {
		System.out.println("호랑이는 네 발로 이동합니다. ");
		
	}
	
}
