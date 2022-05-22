package javaobject;

public class Tiger extends AbstractAnimal {
	int age;
	
	@Override
	// 어차피 abstract 메서드를 사용하니까 그냥 abstract 를 생략한다. 
	// abstract 클래스의 move 라는 객체를 Tiger 에 맞게 만들어 사용한다. 
	void move() {
		System.out.println("호랑이는 네 발로 이동한다. ");
	}

}
