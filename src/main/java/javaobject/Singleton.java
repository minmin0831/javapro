package javaobject;

public class Singleton {
	private static Singleton singleton = new Singleton (); // 유일한 객체이기 때문에 클래스 내부에서 그 유일한 생성자 객체를 만들어 준다. 
	
	private Singleton () {
		System.out.println("싱글톤 입니다. ");
	}
	
	static Singleton getInstance() {
		return singleton; // Singleton은 참조만 가능하다. 
	}
}
